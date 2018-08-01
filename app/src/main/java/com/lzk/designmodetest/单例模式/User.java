package com.lzk.designmodetest.单例模式;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by huqun on 2018/8/1.
 */

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Singleton singleton=Singleton.getInstance();

        singleton.toUse();
    }
}
