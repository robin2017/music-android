package com.example.musicdemo.activity;
import android.os.Bundle;

import com.example.musicdemo.R;

public class LogonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //此处报错，但项目可以正常运行
        setContentView(R.layout.activity_logon);
        initNavBar(false,"登录",false);
    }
}
