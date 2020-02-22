package com.tae.bindingdata;

import androidx.databinding.BaseObservable;

public class Cat extends BaseObservable
{
   private String color;
    private Integer age;

    public Cat() {
    }

    public Cat(String color, Integer age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isOld (Integer age) {
        return age>10;
    }
}
