package com.smartarmenia.dotnetcoresignalrclientjava;

public class SignalRErrorMessage {
    private int type;
    private String error;

    public SignalRErrorMessage(int type, String error) {
        this.type = type;
        this.error = error;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
