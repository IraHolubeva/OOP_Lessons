package com.jetbrains.entity;

import java.util.Scanner;

public class Oval extends Shape
{
    private int xRadius;
    private int yRadius;

    public int getyRadius()
    {
        return xRadius;
    }
    public int getxRadius()
    {
        return yRadius;
    }

    public Oval(String name)
    {
        super(name);
        System.out.println("Enter the xRadius of your oval: ");
        Scanner xR = new Scanner(System.in);
        this.xRadius=xR.nextInt();
        System.out.println("Enter the yRadius of your oval: ");
        Scanner yR = new Scanner(System.in);
        this.yRadius=yR.nextInt();
    }
}
