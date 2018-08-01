package com.lzk.designmodetest.建造者模式;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by huqun on 2018/8/1.
 */

public class Builder extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuilderMode.Builder builder=new BuilderMode.Builder();
        BuilderMode builderMode=builder
                .age(21)
                .name("jerry")
                .sex('男')
                .build();
        int age=builderMode.getAge();
        String name=builderMode.getName();
        char sex=builderMode.getSex();
        Log.d("shiZi","age:"+age+"--"+"name"+name+"--"+"sex"+sex);
    }
}
