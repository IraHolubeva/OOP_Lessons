package com.jetbrains.entity;

import java.util.Scanner;

public class Square extends Shape {
    private int sideSize;

    public int getSideSize() {

        return sideSize;
    }


    public Square(String name) {
        super(name);
        System.out.println("Enter the side size of your square: ");
        Scanner SS = new Scanner(System.in);
        this.sideSize = SS.nextInt();
    }
}
