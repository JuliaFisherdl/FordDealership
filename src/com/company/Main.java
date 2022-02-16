package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/* This project will do the following:
	a. Define a set of cars in car class
	b. Define customers in customers Class
	    1. Calculate their interest rate based on credit score and provide name and interest  rate
    c. Main class will customer request to purchase a car and output how much car costs and if they qualify


	 */
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();

        final int INDEX = 1;
        String[] names = new String[INDEX];
        String[] customer = new String[INDEX];
        int[] randomScore = new int[INDEX];
        double[] randomCredit = new double[INDEX];

        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        car1.setModel("2021 EcoSport S");
        car2.setModel("2022 Mustang MACH-E");
        car3.setModel("2022 Maverick");
        car4.setModel("2021 F-150");
        car5.setModel("2022 E-Transit");

        car1.setCost(10395.00);
        car2.setCost(43895.00);
        car3.setCost(29995.00);
        car4.setCost(39290.00);
        car5.setCost(53295.00);

        Customers[] customers = new Customers[INDEX];



        System.out.println("Customer in the Dealership today:");
        for (int i = 0; i< INDEX; i++)
        {
            customers[i] = new Customers();
            names[i] = userInput.next();
            customers[i].setName(names[i]);
            randomScore[i] = rnd.nextInt(850);
            customers[i].setScore(randomScore[i]);
            randomCredit[i] = rnd.nextInt(50000);
            customers[i].setCredit(randomCredit[i]);
            System.out.println("Customer is " + customers[i].getName() + " and has a score of " + customers[i].getScore());
            System.out.println("Interest rate is: " + customers[i].interestRate() + " %");
            System.out.println("Available Credit is: $" + customers[i].getCredit());


            if(customers[i].getCredit() >= 12469)
                System.out.println("You can afford: " + car1.getModel() + " at $" + ((customers[i].interestRate() * 0.01 * car1.getCost())
                 + car1.getCost()));
            else
                System.out.println("You can't afford a car!!");


        }








    } //End main

} //End Main
