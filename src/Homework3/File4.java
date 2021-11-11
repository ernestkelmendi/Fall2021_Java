package Homework3;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Locale;
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
        // Make America Great Again
        // Outfit Of The Day
        // Happy Birthday To You


        String sentence3 = "Make America Great Again";
        String [] sen3Split = sentence3.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i=0; i< sen3Split.length; i++) {
            abbreviation += sen3Split[i].charAt(0);
        }
        System.out.println(abbreviation);

        String sentence4 = "Outfit Of The Day";
        String [] sen4Split = sentence4.toUpperCase().split(" ");
        abbreviation = "";
        for (int i=0; i< sen4Split.length; i++) {
            abbreviation += sen4Split[i].charAt(0);
        }
        System.out.println(abbreviation);

        String sentence5 = "Happy Birthday To You";
        String [] sen5Split = sentence5.toUpperCase().split(" ");
        abbreviation = "";
        for (int i=0; i< sen5Split.length; i++) {
            abbreviation += sen5Split[i].charAt(0);
        }
        System.out.println(abbreviation);




    }


}
