package com.jetbrains.entity;

import java.util.Scanner;

public class Circle extends Shape
{
    private int diameter;

    public Circle(String name) {
        super(name);
        System.out.println("Enter the diameter of your circle: ");
        Scanner D = new Scanner(System.in);
        this.diameter = D.nextInt();
    }

    public int getDiameter() {
        return diameter;
    }
}
