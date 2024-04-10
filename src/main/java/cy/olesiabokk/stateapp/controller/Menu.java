package cy.olesiabokk.stateapp.controller;

import java.util.Scanner;

public class Menu {
    public Scanner sc = new Scanner(System.in);


    public void sayHello(){
        System.out.println("Hello! Here is State app. And I'm Lucy, I'll help you to find the information you need.");
    }

    public void printICanDo(){
        System.out.println("What can I do:");
    }

    public int getUserNumber(){
        System.out.println("For print State name enter 1");
        System.out.println("For print Capital name enter 2");
        System.out.println("For print State area enter 3");
        System.out.println("For print amount of Regions enter 4");
        System.out.println("For print Residents average age enter 5");
        System.out.println("For print Residents by letters number 6");
        System.out.println("For print Resident names starting by letter you want enter 7");
        System.out.println("For quit enter 0");
        return sc.nextInt();
    }
}
