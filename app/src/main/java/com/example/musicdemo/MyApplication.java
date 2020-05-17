package com.example.musicdemo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化工具
        Utils.init(this);
        System.out.println("===MyApplication onCreate===");
    }
}
