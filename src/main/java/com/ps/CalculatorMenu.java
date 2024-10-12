package com.ps;

import java.util.Scanner;

public class CalculatorMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int mainMenuCommand;

        do{
            System.out.println("Select which calculator you would like to use!");
            System.out.println("1) Mortgage Calculator: ");
            System.out.println("2) Compound Interest Calculator: ");
            System.out.println("3) Exit");

            System.out.println("Choose an option");
            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    mortgageCalculator();
                    break;
                case 2:
                    compoundInterestCalculator();
                    break;
                case 3:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Command not found! Please try again");
            }

        } while(mainMenuCommand != 0);
    }
}
