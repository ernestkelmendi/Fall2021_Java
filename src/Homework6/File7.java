package Homework6;

import java.util.Locale;

public class File7 {
    public static void main(String[] args) {

        // Q1: Create the abbreviation for sentence:
        // Good Morning -> GM
        // Happy New Year -> HNY
        // Happy Birthday To You Dear -> HBTYD
        // Happy New Year To You Dear -> HNYTYD

        String sentence1 = "Good Morning";
        String[] sen1Split = sentence1.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < sen1Split.length; i++) {
            abbreviation += sen1Split[i].charAt(0);
        }
        System.out.println(abbreviation);


        String sentence2 = "Happy New Year";
        String[] sen2Split = sentence2.toUpperCase().split(" ");
        abbreviation = "";
        for (int i = 0; i < sen2Split.length; i++) {
            abbreviation += sen2Split[i].charAt(0);
        }
        System.out.println(abbreviation);


        String sentence3 = "Happy Birthday To You Dear";
        String[] sen3Split = sentence3.toUpperCase().split(" ");
        abbreviation = "";
        for (int i = 0; i < sen3Split.length; i++) {
            abbreviation += sen3Split[i].charAt(0);
        }
        System.out.println(abbreviation);


        String sentence4 = "Happy New Year To You Dear";
        String[] sen4Split = sentence4.toUpperCase().split(" ");
        abbreviation = "";
        for (int i = 0; i < sen4Split.length; i++) {
            abbreviation += sen4Split[i].charAt(0);
        }
        System.out.println(abbreviation);


        //  Q2. Change the given sentence in titlecase:
        // Happy nEW YEAR to YoU dEAr --> Happy new year to you dear

        String sentence8 = "Happy nEW YEAR to YoU dEAr";
        String result = sentence8.toLowerCase(Locale.ROOT);
        System.out.println("\nOriginal sentence : " + sentence8);
        System.out.println("Lowercase string = " + result);

        String resultReplace_h_H = result.replace ("h", "H");
        System.out.println("After replace --> " + resultReplace_h_H);


        //  Q3. Reverse a string
        //  Learn -> nrael
        //  Learn More -> More Learn
        //  Happy birthday to you -> you to birthday Happy

        String orgString = "learn";
        String newString = "";
        for (int i = 1; i <= orgString.length(); i++) {
            newString = newString + orgString.charAt(orgString.length() - i);
        }
        System.out.println("\noriginal String : " + orgString);
        System.out.println("reverse String : " + newString);


            String input = "Learn More";
            String strArray[]=input.split(" ");
            String output="";
            for (int i = strArray.length; i > 0 ; i--) {
                output =output+ " " +strArray[i-1];
            }
            System.out.println("Reverse Sentence : " + output);


            String input2 = "Happy birthday to you";
            String strArray2[]=input2.split(" ");
            String output2="";
            for (int i = strArray2.length; i > 0 ; i--) {
            output2 =output2+ " " +strArray2[i-1];
        }
            System.out.println("Reverse Sentence : " + output2);



        // Q4. Find the maximum value from given int-array

        int arr[] = {54, 24, -4, 0, 2, 45, 54, -9, 7};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\nMaximum number = " + max);


        int arr1[] = {23, 54, 76, 12, 67, 90, 23};
        int maxNumber = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (maxNumber < arr1[i]) {
                maxNumber = arr1[i];
            }
        }
        System.out.println("Maximum number = " + maxNumber);


        int arr2[] = {-2, -9, -4, -7, -9, -55};
        int maxNum = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (maxNum < arr2[i]) {
                maxNum = arr2[i];
            }
        }
        System.out.println("Maximum number = " + maxNum);

    }
}


