package com.lzk.designmodetest.工厂模式;

/**
 * Created by huqun on 2018/8/1.
 */

public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> tClass);
}
