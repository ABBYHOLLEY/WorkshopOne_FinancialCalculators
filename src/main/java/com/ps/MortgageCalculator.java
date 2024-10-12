package com.ps;

import java.util.Scanner;

public class MortgageCalculator {
    public static void mortgageCalculator(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mortgage Calculator");

        // Getting users principal amount
        System.out.println("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Getting users interest rate
        System.out.println("Enter the annual interest rate (in %)");
        double annualInterestRate = scanner.nextDouble();

        // Getting loan length
        System.out.println("Enter the loan length using years: ");
        int years = scanner.nextInt();

        // Need to calculate monthly interest and payments
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Have to make it into a decimal by dividing
        int numberOfPayments = years * 12; // 12 months in year x years

        // Need to come up with monthly payment using a formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/
                (Math.pow(1 + monthlyInterestRate, numberOfPayments)-1);

        // Now, I need to calculate total payment and interest
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        // Retrieving the users results
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Interest You Have Paid: %.2f%n", totalInterest);

        // ALWAYS REMEMBER TO CLOSE SCANNER!
        scanner.close();

    }

    // New calculator
    // Compound interest calculator

    private static void compoundInterestCalculator()
        { Scanner scanner = new Scanner;

        System.out.println("Compound Interest Calculator!");

    // Getting users principal amount
        System.out.println("Enter the principal amount (P): ");
    double principal = scanner.nextDouble();

    // Getting users interest rate
        System.out.println("Enter the annual interest rate (in %)");
    double annualInterestRate = scanner.nextDouble();

    // Getting number of years
        System.out.println("Enter the number of years: (t) ");
    int years = scanner.nextInt();

    int compoundingFrequency = 365; // Compounds daily

    double rate = annualInterestRate / 100; // Calculating interest using division

    double futureValue = principal * Math.pow((1 + rate / compoundingFrequency),(compoundingFrequency * years));

    double totalInterest = futureValue - principal; // Total interest earned

            scanner.close();
    }
}