package com.test.springboot1.Bean;

/**
 * @author:智霸霸
 * @Date 2019/10/16
 */
public class Dog {
    private String dogName;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
