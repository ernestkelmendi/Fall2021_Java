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

        double studentScore = 200.00;
        int maxPointsScore = 250;
        double studentGradeRatio = studentScore / maxPointsScore * 100;

        System.out.println("Student Exam Score is " + studentGradeRatio + "%.");

        if (studentGradeRatio >= 91 && studentGradeRatio <= 100) {
            System.out.println("Student's grade is - GRADE A");
        } else if (studentGradeRatio >= 81 && studentGradeRatio <= 90.99) {
            System.out.println("Student's grade is - GRADE B");
        } else if (studentGradeRatio >= 71 && studentGradeRatio <= 80.99) {
            System.out.println("Student's grade is - GRADE C");
        } else if (studentGradeRatio >= 61 && studentGradeRatio <= 70.99) {
            System.out.println("Student's grade is - GRADE D");
        } else if (studentGradeRatio < 61) {
            System.out.println("Student's grade is - GRADE F");
        } else {
            System.out.println("Invalid student score entered");

        }
    }
}
