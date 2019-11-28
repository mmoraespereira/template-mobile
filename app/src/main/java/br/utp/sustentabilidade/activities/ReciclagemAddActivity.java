package br.utp.sustentabilidade.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import br.utp.sustentabilidade.R;
import br.utp.sustentabilidade.databinding.ActivityMainBinding;
import br.utp.sustentabilidade.databinding.ActivityReciclagemAddBinding;
import br.utp.sustentabilidade.fragments.AgrotoxicoFragment;
import br.utp.sustentabilidade.fragments.OrganicoFragment;
import br.utp.sustentabilidade.fragments.ReciclagemFragment;
import br.utp.sustentabilidade.models.Reciclagem;
import br.utp.sustentabilidade.models.RespostaJSON;
import br.utp.sustentabilidade.network.NetworkManager;
import retrofit2.Call;
import retrofit2.Callback;

public class ReciclagemAddActivity extends AppCompatActivity {

    private ActivityReciclagemAddBinding mBinding;
    private Reciclagem reciclagem = new Reciclagem();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_reciclagem_add);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.adicionar_itens, menu);
        return true;
    }

}
