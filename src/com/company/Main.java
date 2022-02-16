package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* This project will do the following:
	a. Define a set of cars in car class
	b. Define customers in customers Class
	    1. Calculate their interest rate based on credit score and provide name and interest  rate
    c. Main class will customer request to purchase a car and output how much car costs and if they qualify


	 */
        Scanner userInput = new Scanner(System.in);

        final int INDEX = 5;


        Cars car1 = new Cars;
        Cars car2 = new Cars;
        Cars car3 = new Cars;
        Cars car4 = new Cars;
        Cars car5 = new Cars;

        car1.setModel("2021 EcoSport S");
        car2.setModel("2022 Mustang MACH-E");
        car3.setModel("2022 Maverick");
        car4.setModel("2021 F-150");
        car5.setModel("2022 E-Transit");

        car1.setCost(20395.00);
        car2.setCost(43895.00);
        car3.setCost(19995.00)
        car4.setCost(29290.00);
        car5.setCost(43295.00);

        System.out.println("Hello! Nice to meet you! What is your name?");


    } //End main

} //End Main
