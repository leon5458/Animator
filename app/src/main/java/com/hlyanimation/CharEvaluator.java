package com.hlyanimation;

import android.animation.TypeEvaluator;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/2~~~~~~
 * ~~~~~~更改时间:2018/8/2~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class CharEvaluator implements TypeEvaluator<Character> {

    @Override

    public Character evaluate(float fraction, Character startValue, Character endValue) {

        int startInt  = (int)startValue;

        int endInt = (int)endValue;

        int curInt = (int)(startInt + fraction *(endInt - startInt));

        char result = (char)curInt;

        return result;

    }

}