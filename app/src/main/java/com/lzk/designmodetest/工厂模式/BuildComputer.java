package com.lzk.designmodetest.工厂模式;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by huqun on 2018/8/1.
 */

public class BuildComputer extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ComputerFactory mComputerFactory=new FushiKangFactory();
        HuaWeiComputer mHuaWeiComputer=mComputerFactory.createComputer(HuaWeiComputer.class);
        LenovoComputer mLenovoComputer=mComputerFactory.createComputer(LenovoComputer.class);

        mHuaWeiComputer.startComputer();
        mLenovoComputer.startComputer();
    }



}
