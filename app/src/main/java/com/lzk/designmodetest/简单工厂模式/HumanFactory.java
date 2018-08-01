package com.lzk.designmodetest.简单工厂模式;

/**
 * Created by huqun on 2018/8/1.
 */

public class HumanFactory {
    public static Human createHuman(String type){
        Human human=null;
        switch (type){
            case "man":
                human=new Man();
                break;
            case "woman":
                human=new Woman();
                break;
        }
        return human;
    }

}
