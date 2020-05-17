package com.example.musicdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.musicdemo.R;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initNavBar(true, "个人中心", false);
    }

    //public void xxx(View v)形式的方法，才能在xml文件中找到
    public void onLogoutClick(View v) {
        Intent intent = new Intent(this, LogonActivity.class);
        startActivity(intent);
    }
}








