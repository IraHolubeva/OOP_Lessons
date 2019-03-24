package com.jetbrains.entity;

import java.util.Scanner;

public class Triangle extends Shape
{
    private int square;

    public int getSquare()
    {
        return square;
    }
    public Triangle(String name)
    {
        super(name);
        System.out.println("Enter the square of your triangle: ");
        Scanner Sqr = new Scanner(System.in);
        this.square=Sqr.nextInt();
    }





}