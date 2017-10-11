package com.company;

import java.util.Scanner;

public class PetQuestions {


        public static void main( String[] args ){

            //First line added to declare a scanner object
            Scanner keyboard = new Scanner(System.in);


            String name;
            String breed;
            int age;

            System.out.print( "Greetings. What is your pet's name? " );
            name = keyboard.next();

            System.out.print( "What kind of animal is " + name + "? " );

            //Second line added to read user input
            breed = keyboard.next();

            System.out.print( "How old is " + name + "? ");

            // Third line added to read user input
            age = keyboard.nextInt();

            System.out.println( name + " is your " + breed + " and it is " + age );
        }
}
