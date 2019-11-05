package br.utp.sustentabilidade.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {

    private static final String URL = "http://services.koruthos.com.br/sustentabilidade/";
    private static NetworkManager sInstance = new NetworkManager();

    private final Retrofit mRetrofit;
    private final OkHttpClient mHttpClient;
    private final SustentabilidadeService mService;

    private NetworkManager() {

        // Cria o interceptador de request/response para os logs
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        mHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // Inicia o retrofit
        mRetrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .client(mHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mService = mRetrofit.create(SustentabilidadeService.class);
    }

    public static NetworkManager getInstance() {
        if (sInstance == null) sInstance = new NetworkManager();
        return sInstance;
    }

    public static void cancelRequests() {
        sInstance.mHttpClient.dispatcher().cancelAll();
    }

    public static SustentabilidadeService service() {
        return getInstance().mService;
    }

}
