package CodeTest;

public class Test2 {
    static int findSum(int number)
    {
        // Q2

        int sum;
        for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);
        return sum;
    }
    public static void main(String args[])
    {
        int number = 123;
        System.out.println("The sum of digits: "+findSum(number));

        int number2 = 323;
        System.out.println("\nThe sum of digits: "+findSum(number2));

        int number3 = 90;
        System.out.println("\nThe sum of digits: "+findSum(number3));



    }

}
