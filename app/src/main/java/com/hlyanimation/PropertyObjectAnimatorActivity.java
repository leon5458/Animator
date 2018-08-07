package com.hlyanimation;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/1~~~~~~
 * ~~~~~~更改时间:2018/8/1~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class PropertyObjectAnimatorActivity extends AppCompatActivity {

    private Button btn;

    /**
     * ObjectAnimator是派生自ValueAnimator的，所以ValueAnimator中所能使用的方法，在ObjectAnimator中都可以正常使用。
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_object_animator);
        btn = findViewById(R.id.btn);

        findViewById(R.id.alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "alpha", 2, 0, 1);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.rotation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "rotation", 0, 360, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.rotationX).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "rotationX", 0, 270, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.rotationY).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "rotationX", 0, 270, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.translationX).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "translationX", 0, -270, 0, 200);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.translationY).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "translationY", 0, 270, -200, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });

        findViewById(R.id.scaleX).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "scaleX", 0, 2, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });


        findViewById(R.id.scaleY).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "scaleY", 0, 3, 0);
                animator.setDuration(2000);
                animator.start();
            }
        });

    }
}
