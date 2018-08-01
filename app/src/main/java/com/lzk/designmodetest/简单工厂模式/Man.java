package com.lzk.designmodetest.简单工厂模式;

import android.util.Log;

import com.lzk.designmodetest.简单工厂模式.Human;

/**
 * Created by huqun on 2018/8/1.
 */

public class Man extends Human {
    @Override
    public void say() {
        Log.d("shiZi","man");
    }
}
