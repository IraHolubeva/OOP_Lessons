package com.jetbrains.entity;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void draw()
    {
        System.out.println(name);

    }

}