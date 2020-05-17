package com.example.musicdemo.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;

public class UserUtils {
    /**
     * 验证登录用户输入合法性
     */
    public static boolean validateLogin(Context context, String phone, String password) {
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /**
     * 验证注册用户输入合法性
     */
    public static boolean validateRegister(Context context, String phone, String password,String passwordConfirm) {
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!TextUtils.equals(password,passwordConfirm)) {
            Toast.makeText(context, "两次密码输入不一致", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
