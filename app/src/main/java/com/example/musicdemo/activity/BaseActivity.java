package com.example.musicdemo.activity;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicdemo.R;


public class BaseActivity extends Activity {
    private ImageView ivLeft, ivRight;
    private TextView tvTitle;

    protected void initNavBar(boolean showLeft, String title, boolean showRight) {

        ivLeft = findViewById(R.id.iv_left);
        ivRight = findViewById(R.id.iv_right);
        tvTitle = findViewById(R.id.tv_title);

        ivLeft.setVisibility(showLeft ? View.VISIBLE : View.GONE);
        ivRight.setVisibility(showRight ? View.VISIBLE : View.GONE);
        tvTitle.setText(title);
        //后退按钮
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}











