package com.example.contacts;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    //generate overide methods,oncreate

    public static final String APPLICATION_ID = "B7B5D10F-D686-511A-FF97-FF5770B09200";   // from backendless
    public static final String API_KEY = "953772DD-9E7A-44B6-9F55-6B9CC8FD0AF0";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),
                APPLICATION_ID,
                API_KEY);
    }
}