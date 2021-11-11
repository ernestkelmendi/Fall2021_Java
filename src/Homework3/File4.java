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
        // Make America Great Again - M A G A
        // Outfit Of The Day = O O T D
        // Happy Birthday To You = H B T Y


        String sentence3 = "Make America Great Again";
        sentence3=sentence3.toUpperCase(Locale.ROOT);
        String[] sentence3Array = sentence3.split(" ");
        System.out.println(sentence3Array[0].charAt(0) + "" + sentence3Array[1].charAt(0)  + "" + sentence3Array[2].charAt(0) + "" + sentence3Array[3].charAt(0));

        String sentence4 = "Outfit Of The Day";
        sentence4=sentence4.toUpperCase(Locale.ROOT);
        String[] sentence4Array = sentence4.split(" ");
        System.out.println(sentence4Array[0].charAt(0) + "" + sentence4Array[1].charAt(0)  + "" + sentence4Array[2].charAt(0) + "" + sentence4Array[3].charAt(0));

        String sentence5 = "Happy Birthday To You";
        sentence5=sentence5.toUpperCase(Locale.ROOT);
        String[] sentence5Array = sentence5.split(" ");
        System.out.println(sentence5Array[0].charAt(0) + "" + sentence5Array[1].charAt(0)  + "" + sentence5Array[2].charAt(0) + "" + sentence5Array[3].charAt(0));






    }


}
