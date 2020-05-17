package com.example.musicdemo.activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.musicdemo.R;
import com.example.musicdemo.utils.UserUtils;
import com.example.musicdemo.views.InputView;

public class RegisterActivity extends BaseActivity {
    private InputView mPhone, mPassword,mPasswordConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }
    private void initView() {
        initNavBar(true, "注册", false);
        mPhone = findViewById(R.id.input_phone);
        mPassword = findViewById(R.id.input_password);
        mPasswordConfirm = findViewById(R.id.input_password_confirm);
    }

    //注册点击
    public void onRegisterClick(View v) {
        Toast.makeText(v.getContext(), "确认注册", Toast.LENGTH_SHORT).show();
        String phone = mPhone.getInputStr();
        String password = mPassword.getInputStr();
        String password2 = mPasswordConfirm.getInputStr();
        if(UserUtils.validateRegister(v.getContext(),phone,password,password2)){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
