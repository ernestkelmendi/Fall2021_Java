package Homework3;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {

        // Q1
        // 1. Store a country name in a variable;
        // 2. Print the name of the country;

        String[] countryName = new String[1];
        countryName[0] = "United States of America";
        System.out.println(Arrays.toString(countryName));

        String myString = "United States of America";
        System.out.println("My String = " + myString);

        // 3. Print the length of country name;

        int totalNumberOfCountry = myString.length();
        System.out.println("Length of Country Name : " + myString.length());

        String[] country = {"United States Of America"};
        int arrayLength = country.length;
        System.out.println("The size of array is : " +arrayLength);


        // Q2
        // Print the number of words in the sentence2-value;
        // String sentence2 = "Health was Earlier said to Be the ability of the body functioning wElL";

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning wElL";
        String [] afterSplitBy_Space = sentence2.split(" ");
        System.out.println(Arrays.toString(afterSplitBy_Space));


        // Q3
        // Create the abbreviation for 4-word sentence;
        // make america great again - M A G A
        // outfit of the day = O 0 T D
        // happy birthday to you = H B T Y

       // I need to discuss this with you in :Lab Session








    }


}
