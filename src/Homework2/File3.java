package Homework2;

import java.util.Locale;

public class File3 {
    public static void main(String[] args) {

        // 1. String sentence 1 = "Hello dear, how are you doing?";
        // Store 100 in result 1 if the length of sentence 1 is greater than or equal to 10; else store 150 in result;
        // Use ternary operator;

        String sentence1 = "Hello dear, how are you doing?";
        System.out.println("Sentence1 : " + sentence1);

        int sentence1Length = sentence1.length();
        System.out.println("Length of '" + sentence1 + "' is : " + sentence1Length);

        int number1 = 100;
        double number2 = number1>=30?100:150;
        System.out.println("Result1 is '" + number2 + "'");

        number1=100;
        boolean lengthOfSentence = true;
        System.out.println("Length of Sentence1 is greater or equal to 10 = " + lengthOfSentence);



        // 2. String sentence 2 = "Health was Earlier said to Be the ability of the body functioning WElL."
        // Replace all instances of a/A with Z;

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String result = sentence2.toLowerCase(Locale.ROOT);
        System.out.println("\nOriginal sentence2 : " + sentence2);
        System.out.println("Lowercase string = " + result);


        String resultReplace_a_Z = result.replace ("a", "Z");
        System.out.println("\nSentence2 -->" + result);
        System.out.println("After replace -->" + resultReplace_a_Z);


        // 3. String sentence 3 = "Health was Earlier said to Be the ability of the body functioning WElL."
        // Print:
        //          1. The length of the sentence 3 - value;
        //          2. If the sentence 3 starts with "health" (ignoring cases);
        //          3. Results if sentence 3 contains "body" (ignoring cases);
        //          4. Index of "Body" in sentence 3;

        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\nSentence3 : " + sentence3);

        // 1. The length of the sentence 3 - value;

        int sentence3Length = sentence3.length();
        System.out.println("Length of '" + sentence3 + "' is : " + sentence3Length);

        // 2. If the sentence 3 starts with "health" (ignoring cases);

        sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\nSentence3 : " + sentence3);

        String result2 = sentence3.toLowerCase(Locale.ROOT);
        System.out.println("\nOriginal sentence3 : " + sentence3);
        System.out.println("Lowercase string = " + result2);

        boolean isStartsWith_health=result2.startsWith ("health");
        System.out.println("is'" + result2 + "'starts with 'health'?: " + isStartsWith_health);

        // 3. Results if sentence 3 contains "body" (ignoring cases);

        sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        boolean isContains_body = result2.contains("body");
        System.out.println("is '" + "'contains 'body'? : "+ isContains_body);

        // 4. Index of "Body" in sentence 3;

        sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\nSentence3 : " + sentence3);

        String healthString = "Health was Earlier said to Be the ability of the body functioning WElL.";
        int indexOf_body = healthString.indexOf("body");
        System.out.println("Index of 'body' in " + healthString + "'is' :" + indexOf_body);









    }

}