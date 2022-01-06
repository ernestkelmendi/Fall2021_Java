package CodeTest2;


public class Q1 {
    public static void main(String[] args) {


        int numbers[] = {32, 54, 12, 67, 2, 5};
        System.out.println("\nMaximum Value = " + getMaxValue(numbers));

        int numbers2[] = {5, 4, 3, 1, 2};
        System.out.println("Maximum Value = " + getMaxValue(numbers2));

        int numbers3[] = {90, 34, 12, 4};
        System.out.println("Maximum Value = " + getMaxValue(numbers3));

        int numbers4[] = {-15, -4, -12, -7};
        System.out.println("Maximum Value = " + getMaxValue(numbers4));


    }

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