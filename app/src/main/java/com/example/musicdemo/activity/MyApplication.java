package com.example.musicdemo.activity;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("===MyApplication onCreate===");
    }
}
