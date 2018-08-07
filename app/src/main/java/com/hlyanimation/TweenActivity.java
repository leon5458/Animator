package com.hlyanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/1~~~~~~
 * ~~~~~~更改时间:2018/8/1~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class TweenActivity extends AppCompatActivity {
    /**
     * 分为java代码和xml
     *
     * @param savedInstanceState
     */

    private ImageView img;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tween_activity_layout);
        img=findViewById(R.id.img);


        /**
         * 平移
         */
        findViewById(R.id.translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //平移动画
                /**
                 * java代码实现
                 */
//                TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 100);
//                translateAnimation.setRepeatCount(Animation.RESTART);
//                translateAnimation.setFillAfter(true);
//                translateAnimation.setDuration(2000);
//                translateAnimation.setRepeatCount(5);
//                img.startAnimation(translateAnimation);

                /**
                 * xml
                 */
                TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(TweenActivity.this, R.anim.translate);
                translateAnimation.setFillAfter(true);
                img.startAnimation(translateAnimation);

            }
        });


        findViewById(R.id.scale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //缩放动画
//                ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2, Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF);
//                scaleAnimation.setRepeatMode(Animation.REVERSE);
//                scaleAnimation.setFillAfter(true);
//                scaleAnimation.setDuration(2000);
//                scaleAnimation.setRepeatCount(5);
//                img.startAnimation(scaleAnimation);

                ScaleAnimation scaleAnimation = (ScaleAnimation) AnimationUtils.loadAnimation(TweenActivity.this, R.anim.scale);
                img.startAnimation(scaleAnimation);


            }
        });


        findViewById(R.id.alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //透明度动画
//                AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0.5f);
//                alphaAnimation.setRepeatMode(Animation.REVERSE);
//                alphaAnimation.setFillAfter(true);
//                alphaAnimation.setDuration(2000);
//                alphaAnimation.setRepeatCount(1);
//                img.startAnimation(alphaAnimation);
                /**
                 * xml
                 */
                AlphaAnimation alphaAnimation = (AlphaAnimation) AnimationUtils.loadAnimation(TweenActivity.this, R.anim.alpha);
                img.startAnimation(alphaAnimation);

            }
        });


        findViewById(R.id.rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //旋转动画
                /**
                 * java代码
                 */
//                RotateAnimation rotateAnimation = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF);
//                rotateAnimation.setRepeatMode(Animation.REVERSE);
//                rotateAnimation.setFillAfter(true);
//                rotateAnimation.setDuration(2000);
//                rotateAnimation.setRepeatCount(5);
//                img.startAnimation(rotateAnimation);

                RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(TweenActivity.this, R.anim.rotate);
                img.startAnimation(rotateAnimation);

            }
        });


        findViewById(R.id.and).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //动画集合
//                ScaleAnimation scaleAnim = new ScaleAnimation(1, 2, 1, 2, Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF);
//                scaleAnim.setRepeatMode(Animation.REVERSE);
//                scaleAnim.setFillAfter(true);
//                scaleAnim.setDuration(2000);
//                scaleAnim.setRepeatCount(1);
//
//                AlphaAnimation alphaAnim = new AlphaAnimation(1, 0.5f);
//                alphaAnim.setRepeatMode(Animation.REVERSE);
//                alphaAnim.setFillAfter(true);
//                alphaAnim.setDuration(2000);
//                alphaAnim.setRepeatCount(1);
//
//                AnimationSet set = new AnimationSet(true);
//                set.addAnimation(scaleAnim);
//                set.addAnimation(alphaAnim);
//                img.startAnimation(set);


                Animation mutipleAnimation = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.set);
                img.startAnimation(mutipleAnimation);

            }
        });


    }
}
