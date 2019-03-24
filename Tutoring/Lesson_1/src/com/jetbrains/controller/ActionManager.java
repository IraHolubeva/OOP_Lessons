package com.jetbrains.controller;

import com.jetbrains.entity.Shape;
import com.jetbrains.entity.Square;
import com.jetbrains.entity.Triangle;
import com.jetbrains.entity.Oval;
import com.jetbrains.entity.Rhombus;
import com.jetbrains.entity.Circle;
import com.jetbrains.MainApp.Main;

import java.util.Scanner;

public class ActionManager
{

    Shape shape;

    public void performAction(String name, int amount)
    {
        switch(name) {
            case "triangle":
                shape = new Triangle(name);
                for (int i = 0; i < amount; i++) {
                    shape.draw();

                }
                break;

            case "square":
                shape = new Square(name);
                for (int i = 0; i < amount; i++) {
                    shape.draw();

                }
                break;
            case "oval":
                shape = new Oval(name);
                for (int i = 0; i < amount; i++) {
                    shape.draw();
                }
                break;
            case "rhombus":
                shape = new Rhombus(name);
                for (int i = 0; i < amount; i++) {
                    shape.draw();
                }
                break;
            case "circle":
                shape = new Circle(name);
                for (int i = 0; i < amount; i++) {
                    shape.draw();
                }
                break;


        }

    }
}