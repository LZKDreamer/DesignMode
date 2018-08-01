package com.lzk.designmodetest.工厂模式;

/**
 * Created by huqun on 2018/8/1.
 */

public class FushiKangFactory extends ComputerFactory{
    @Override
    public <T extends Computer> T createComputer(Class<T> tClass) {
        Computer computer=null;
        String className=tClass.getName();
        try {
            computer= (Computer) Class.forName(className).newInstance();
            
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
