package br.utp.sustentabilidade.models;

import com.google.gson.annotations.SerializedName;

public class RespostaJSON<T> {

    @SerializedName("date")
    private String mDate;

    @SerializedName("status")
    private int mStatus;

    @SerializedName("message")
    private String mMessage;

    @SerializedName("object")
    private T mObject;

    public String getDate() {
        return mDate;
    }

    public void setDate(final String date) {
        mDate = date;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(final int status) {
        mStatus = status;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(final String message) {
        mMessage = message;
    }

    public T getObject() {
        return mObject;
    }

    public void setObject(final T object) {
        mObject = object;
    }
}
