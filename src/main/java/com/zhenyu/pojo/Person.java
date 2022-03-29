package com.zhenyu.pojo;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/5/7 21:36
 */
public class Person {
    private String name ;
    private int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
