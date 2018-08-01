package com.lzk.designmodetest.建造者模式;

/**
 * Created by huqun on 2018/7/31.
 */

public class BuilderMode {
    private String name;
    private int age;
    private char sex;

    private BuilderMode(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.sex=builder.sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    static class Builder{
        private String name;
        private int age;
        private char sex;

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Builder sex(char sex){
            this.sex=sex;
            return this;
        }

        public BuilderMode build(){
            return new BuilderMode(this);
        }
    }
}
