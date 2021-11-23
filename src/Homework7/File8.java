package Homework7;

import java.sql.Array;

public class File8 {
    public static void main(String[] args) {


        String abr = createAbbreviation("Good Morning");
        System.out.println(abr);

        String abr2 = createAbbreviation("Happy New Year");
        System.out.println(abr2);

        String abr3 = createAbbreviation("Happy Birthday To You Dear");
        System.out.println(abr3);

        String abr4 = createAbbreviation("Happy New Year To You Dear");
        System.out.println(abr4);

        String Title = createTitle("\nHappy nEW YEAR to YoU dEAr");
        System.out.println(Title);

        String Reverse = reverse("Learn More");
        System.out.println(Reverse);

        String Reverse2 = reverse("\nHappy birthday to you");
        System.out.println(Reverse2);

        int numbers[] = {1, 5, -9, 12, -3, 89, 18, 23, 4, -6};
        System.out.println("\nMaximum Value = " + getMaxValue(numbers));

        int numbers2[] = {788, 43, -12, 77, -98, 100, 32, 48, 5, -87};
        System.out.println("Maximum Value = " + getMaxValue(numbers2));


    }

    //  Q1. Create a method to make abbreviation for a given sentences:
    //      Good Morning -> GM
    //      Happy New Year -> HNY
    //      Happy Birthday To You Dear -> HBTYD
    //      Happy New Year To You Dear -> HNYTYD
    //      Method should return.

    public static String createAbbreviation(String sentence1) {
        String[] sen1Split = sentence1.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < sen1Split.length; i++) {
            abbreviation += sen1Split[i].charAt(0);
        }
        return abbreviation;
    }

    //  Q2. Create a method that will change the given sentence in Titlecase;
    //      Happy nEW YEAR to YoU dEAr --> Happy New Year To You Dear;
    //      Method should return;


    public static String createTitle(String sentence2) {
        String[] arrsentence2 = sentence2.toLowerCase().split(" ");
        String newSentence2 = "";
        for (int i = 0; i <= arrsentence2.length - 1; i++) {
            newSentence2 += arrsentence2[i].substring(0, 1).toUpperCase() + arrsentence2[i].substring(1) + " ";
        }
        return newSentence2;
    }

    // Q3. Create a method to reverse a String;
    //     Learn More --> More Learn
    //     Happy birthday to you --> you to birthday Happy
    //     Method should return;

    public static String reverse(String sentence3) {
        String[] strArray = sentence3.split(" ");
        String output = "";
        for (int i = strArray.length; i > 0; i--) {
            output = output + " " + strArray[i - 1];
        }
        return output;

    }

    // Q4. Create a method to find the maximum value from given int-array;
    //     Method should return;

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;


    }
}

















