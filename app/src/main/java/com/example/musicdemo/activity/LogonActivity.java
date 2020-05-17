package com.example.musicdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.musicdemo.R;
import com.example.musicdemo.utils.UserUtils;
import com.example.musicdemo.views.InputView;

public class LogonActivity extends BaseActivity {
    private InputView mPhone, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //此处报错，但项目可以正常运行
        setContentView(R.layout.activity_logon);
        initView();
    }

    private void initView() {
        initNavBar(false, "登录", false);
        mPhone = findViewById(R.id.input_phone);
        mPassword = findViewById(R.id.input_password);

    }

    //注册点击
    public void onRegisterClick(View v) {

    }

    //登录点击
    public void onCommitClick(View v) {
        String phone = mPhone.getInputStr();
        String password = mPassword.getInputStr();
        if (UserUtils.validateLogin(this, phone, password)) {
            Intent intent = new Intent(this,
                    MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
