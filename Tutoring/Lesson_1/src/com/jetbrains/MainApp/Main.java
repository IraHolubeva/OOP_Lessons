package com.jetbrains.MainApp;

import com.jetbrains.controller.ActionManager;
import com.jetbrains.entity.Shape;
import com.jetbrains.entity.Square;
import com.jetbrains.entity.Triangle;
import com.jetbrains.entity.Oval;
import com.jetbrains.userInterface.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ActionManager manager = new ActionManager();
        manager.performAction(getShapeNameInput(), getShapeAmount());
    }

    public static String getShapeNameInput(){
        System.out.println("Enter shape name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getShapeAmount(){
        System.out.println("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
