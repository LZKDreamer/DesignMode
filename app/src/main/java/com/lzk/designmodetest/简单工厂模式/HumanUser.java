package com.lzk.designmodetest.简单工厂模式;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by huqun on 2018/8/1.
 */

public class HumanUser extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HumanFactory.createHuman("man").say();
    }
}
