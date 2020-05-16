package com.example.musicdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.musicdemo.MainActivity;
import com.example.musicdemo.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends AppCompatActivity {
    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    private void init() {
        mTimer = new Timer();
        //第一个参数为回调
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                //在Logcat中可以查看日志，登记error
                Log.e("跳转到主页面", String.valueOf(3));
                toMain();
            }
        }, 3000);
    }

    private void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
