package com.smartarmenia.dotnetcoresignalrclientjava;

public interface HubConnectionListener {
    void onConnected();

    void onDisconnected();

    void onMessage(HubMessage message);

    void onErrorMessage(SignalRErrorMessage message);

    void onError(Exception exception);
}
