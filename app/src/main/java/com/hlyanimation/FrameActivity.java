package com.hlyanimation;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/1~~~~~~
 * ~~~~~~更改时间:2018/8/1~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class FrameActivity extends AppCompatActivity{
    private Button startBtn;// 开始动画按钮
    private Button stopBtn;// 停止动画按钮
    private ImageView imageView,image;// 显示图片
    private AnimationDrawable anim,animationDrawable;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_activity_layout);
        // 实例化控件
        startBtn =  findViewById(R.id.start);
        stopBtn =  findViewById(R.id.stop);
        imageView = findViewById(R.id.image);
        image =findViewById(R.id.img);
        // 指定动画的帧的列表
        imageView.setBackgroundResource(R.drawable.frame);
        image.setBackgroundResource(R.drawable.boy_and_girl);
        // AnimationDrawable--与逐帧动画相关的Drawable
        anim = (AnimationDrawable) imageView.getBackground();
        animationDrawable = (AnimationDrawable) image.getBackground();

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 开始动画
                anim.start();
                animationDrawable.start();

            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim.stop();
                animationDrawable.stop();
            }
        });
    }
}
