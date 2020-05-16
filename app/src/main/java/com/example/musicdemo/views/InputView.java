package com.example.musicdemo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musicdemo.R;


/**
 * 自定义View的三个可配置项
 * 1、input_icon：输入框前面图标
 * 2、input_hint：输入框的提示
 * 3、is_password：输入内容是否秘文显示
 */
public class InputView extends FrameLayout {
    private int inputIcon;
    private String inputHint;
    private Boolean isPassword;


    private View mView;
    private ImageView mIcon;
    private EditText mText;

    public InputView(@NonNull Context context) {
        super(context);
        init(context, null);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs == null) return;
        //获取自定义属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.inputValue);
        //第二个为默认值
        inputIcon = typedArray.getResourceId(R.styleable.inputValue_input_icon, R.mipmap.welcome_icon);
        inputHint = typedArray.getString(R.styleable.inputValue_input_hint);
        //第二个为默认值
        isPassword = typedArray.getBoolean(R.styleable.inputValue_is_password, false);

        typedArray.recycle();//释放


        mView = LayoutInflater.from(context).inflate(R.layout.input_view, this, false);
        mIcon = mView.findViewById(R.id.iv_icon);
        mText = mView.findViewById(R.id.ev_text);

        //布局关联属性
        mIcon.setImageResource(inputIcon);
        mText.setHint(inputHint);
        mText.setInputType(isPassword ? InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD : InputType.TYPE_CLASS_PHONE);
        addView(mView);
    }

    //返回输入内容
    public String getInputStr(){
        return mText.getText().toString().trim();
    }
}
