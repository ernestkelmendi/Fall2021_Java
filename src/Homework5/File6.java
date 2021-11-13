package Homework5;

public class File6 {
    public static void main(String[] args) {

        // 1. Create an int variable and store any value in it if the number is divisible by 5 print "divisible by 5"
        //    If the num is divisible by 3, print "divisible by 3"
        //    If the num is divisible by 5 and 3, print "divisible by and 3"
        //    If the num is NOT divisible by 5, 3, or 15 print the value in int-variable

        int num = 9;
        if (num % 5 == 0) {
            System.out.println("num is divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println("num is divisible by 3");
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("num is divisible by 5 and 3");
        } else {
            System.out.println("if the number is not divisible by 5, 3 or 5");
        }

        // 2. Create two variables, one to store student-score and another to store the max-score
        //    If the student score is not valid, print error statement "Invalid student score entered".
        //    Based on the student scoring percentage, print the grade.

        double studentScore = 89.23;
        int maxScore = 100;
        if (studentScore == 100) {
            System.out.println("\nMAXIMUM SCORE - GRADE A+ - Student has passed");
        } else if (studentScore >= 81 || studentScore == 90.99) {
            System.out.println("\nGRADE A - Student has passed");
        } else if (studentScore >= 81 || studentScore == 90.99) {
            System.out.println("\nGRADE B - Student has passed");
        } else if (studentScore >= 71 || studentScore == 80.99) {
            System.out.println("\nGRADE C - Student has passed");
        } else if (studentScore >= 61 || studentScore == 70.99) {
            System.out.println("\nGRADE D - Student has passed");
        } else if (studentScore < 61) {
            System.out.println("\nGRADE E - Student has failed");
        }
        }



    }

