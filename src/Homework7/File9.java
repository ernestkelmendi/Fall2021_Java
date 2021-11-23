package Homework7;

public class File9 {
    public static void main(String[] args) {

        //  Q5. Create a method to find if the given string is palindrome:
        //      "level" --> true
        //      "eye" --> true
        //      "fall" --> false
        //      "Level" --> true

        System.out.println("Is the word 'level' a palindrome :");
        String word = "level";
        StringBuffer newWord = new StringBuffer();
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord = newWord.append(word.charAt(i));
        }
        if (word.equalsIgnoreCase(newWord.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\nIs the word 'eye' a palindrome :");
        String word2 = "eye";
        StringBuffer newWord2 = new StringBuffer();
        for (int i = word2.length() - 1; i >= 0; i--) {
            newWord2 = newWord2.append(word2.charAt(i));
        }
        if (word2.equalsIgnoreCase(newWord2.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

        System.out.println("\nIs the word 'fall' a palindrome :");
        String word3 = "fall";
        StringBuffer newWord3 = new StringBuffer();
        for (int i = word3.length() - 1; i >= 0; i--) {
            newWord3 = newWord3.append(word3.charAt(i));
        }
        if (word3.equalsIgnoreCase(newWord3.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\nIs the word 'Level' a palindrome :");
        String word4 = "Level";
        StringBuffer newWord4 = new StringBuffer();
        for (int i = word4.length() - 1; i >= 0; i--) {
            newWord4 = newWord4.append(word4.charAt(i));
        }
        if (word4.equalsIgnoreCase(newWord4.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Q6.  Create a method to find the average of given int-array;
        //      Method should return;


        //  Q7. Create a method to find the longest String in the given String-array;
        //      ["happy", "Happy new year", "peaceful", "king kong"];
        //      Method should return;

            String[] sentence = {"happy", "Happy new year", "peaceful", "king kong"};
            String a= getLongestString(sentence);
            System.out.println("\nthe longest String in the given string-array is : '" +a +"'");
        }

        public static String getLongestString(String []sentence) {

            int i = 0;
            for (i = 0; i <= sentence.length; i++) {
                if (sentence[i].length() > sentence[i + 1].length()) {
                    return (sentence[i]);
                }
            }
            return null;
        }

    }



