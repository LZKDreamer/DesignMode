package com.lzk.designmodetest.单例模式;

/**
 * Created by huqun on 2018/7/31.
 */

public class Singleton {
    /*
        *  单例模式--饿汉模式*/
        private Singleton(){

        }

        private static Singleton sSingleton=new Singleton();

        public static Singleton getInstance(){
            return sSingleton;
        }

        public void toUse(){

        }
}
