package com.company.base.classload;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/2 0:25
 */
public class Animal {
    private int age;

    static {
        System.out.println("static animal");
    }

    public Animal() {

    }

    Animal(int age) {
        this.age = age;
        System.out.println("animal age contruct");
    }

    public String hello() {
        return "我是动物";
    }

    public int getAge() {
        return age;
    }

    public String test() {
        return "test";
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        List<Integer> b = new LinkedList<>();
        List<Integer> c = new ArrayList<>();
    }
}
