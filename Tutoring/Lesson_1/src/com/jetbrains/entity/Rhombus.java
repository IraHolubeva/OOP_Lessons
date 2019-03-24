package com.jetbrains.entity;

import java.util.Scanner;

public class Rhombus extends Shape
{

    private int diagonal1;
    private int diagonal2;

    public int getDiagonal1()
    {

        return diagonal1;
    }

    public int getDiagonal2()
    {

        return diagonal2;
    }

    public Rhombus(String name)
    {
        super(name);
        System.out.println("Enter the first diagonal of your rhombus: ");
        Scanner D1=new Scanner(System.in);
        this.diagonal1=D1.nextInt();
        System.out.println("Enter the second diagonal of your rhombus: ");
        Scanner D2=new Scanner(System.in);
        this.diagonal2=D2.nextInt();
    }



}