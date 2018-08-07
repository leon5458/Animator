package com.hlyanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDate;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/1~~~~~~
 * ~~~~~~更改时间:2018/8/1~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class PropertyValueAnimatorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView ofInt, ofFloat, ofObject, ofint1;

    private Button btn;


    /**
     * ValueAnimator只负责对指定的数字区间进行动画运算
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.property_activity_layout);

        btn = findViewById(R.id.btn);

        ofInt = findViewById(R.id.java_ofint);
        ofInt.setOnClickListener(this);
        ofint1 = findViewById(R.id.ofint);
        ofint1.setOnClickListener(this);

        ofFloat = findViewById(R.id.java_ofFloat);
        ofFloat.setOnClickListener(this);
        ofFloat = findViewById(R.id.java_ofObject);
        ofFloat.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.java_ofint:
                // 步骤1：设置属性数值的初始值 & 结束值
                ValueAnimator valueAnimator = ValueAnimator.ofInt(btn.getLayoutParams().width, 600);
                // 初始值 = 当前按钮的宽度，此处在xml文件中设置为150
                // 结束值 = 500
                // ValueAnimator.ofInt()内置了整型估值器,直接采用默认的.不需要设置
                // 即默认设置了如何从初始值150 过渡到 结束值500
                // 步骤2：设置动画的播放各种属性
                valueAnimator.setDuration(2000);//动画时间
                // 步骤3：将属性数值手动赋值给对象的属性:此处是将 值 赋给 按钮的宽度
                // 设置更新监听器：即数值每次变化更新都会调用该方法
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int currentValue = (Integer) valueAnimator.getAnimatedValue();
                        // 获得每次变化后的属性值
                        System.out.println(currentValue);
                        // 输出每次变化后的属性值进行查看

                        btn.getLayoutParams().width = currentValue;
                        // 每次值变化时，将值手动赋值给对象的属性
                        // 即将每次变化后的值 赋 给按钮的宽度，这样就实现了按钮宽度属性的动态变化

                        // 步骤4：刷新视图，即重新绘制，从而实现动画效果
                        btn.requestLayout();
                    }
                });
                valueAnimator.start();
                break;

            case R.id.ofint:
                final ValueAnimator animator = ValueAnimator.ofInt(0,400);
                animator.setDuration(1000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int curValue = (int)animator.getAnimatedValue();
                        btn.layout(curValue,curValue,curValue+btn.getWidth(),curValue+btn.getHeight());
                    }
                });
                animator.start();
                break;

            case R.id.java_ofFloat:
//                final ValueAnimator anim = ValueAnimator.ofFloat(0, 3);
                final ValueAnimator anim = ValueAnimator.ofFloat(0f,400f,50f,300f);
                anim.setDuration(2000);
                anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Float curValueFloat = (Float)anim.getAnimatedValue();
                        int curValue = curValueFloat.intValue();
                        Log.d("=====value====", curValue + "");

                        btn.layout(curValue,curValue,curValue+btn.getWidth(),curValue+btn.getHeight());

                    }
                });
                anim.start();
                break;
            /**
             * ValueAnimator.ofInt（）与ValueAnimator.oFloat（）仅仅只是在估值器上的区别：（即如何从初始值 过渡 到结束值）
             */
            case R.id.java_ofObject:

                ValueAnimator animator1 = ValueAnimator.ofObject(new CharEvaluator(),new Character('A'),new Character('Z'));

                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override

                    public void onAnimationUpdate(ValueAnimator animation) {
                        char text = (char)animation.getAnimatedValue();
                        btn.setText(String.valueOf(text));
                    }

                });
                animator1.setDuration(1000);
                animator1.setInterpolator(new AccelerateInterpolator());//chazhiqi
                animator1.start();
        }
    }
}
