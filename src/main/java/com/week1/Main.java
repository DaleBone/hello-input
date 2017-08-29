package com.week1;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Write your code here */
        //Enter name/hello name
        String name = stringInput("Please enter your name?");
        System.out.println("Hello, " + name + "!");

        //Count from 0 to 10
        for (int x = 0; x < 10; x++) {
            System.out.println(x);

        }


        //January dates
        System.out.println("Here are all the dates in January");
        for (int day=1; day <= 31; day++){
            System.out.println("January " + day);
        }

        //two different ways to do the car mileage loop
        for(int miles=53000; miles <= 74000 ;miles = miles + 3000){
            System.out.println("Your car has " + miles + " on it");
        }
        int miles = 50000;
        int oilChangeIncrement = 3000;
        for(int x =0; x <8; x++){
            miles = miles + oilChangeIncrement;
            System.out.println(miles);

        }

        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");


        while (! userPassword.equals(secretPassword) ){
            System.out.println("Password incorrect, access denied!");

            System.out.println("Try again");

            userPassword = stringInput("Enter the password");
        }

        System.out.println("Correct password - access granted");


        int secretNumber = 7;
        boolean numberGuess = true;

        while (numberGuess){
            int userGuess = intInput("Guess a number between 1 and 10.");

            if (userGuess == secretNumber){
                System.out.println("You've guessed the correct number!");
                break;
            } else if (userGuess <= 1 || userGuess >= 10){
                System.out.println("I said between 1 and 10. Listen better!");

            } else{
                System.out.println("So close, yet so far. Try again.");
            }
        }

        System.out.println("Thanks for playing!");


    }

}


