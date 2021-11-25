package CodeTest;

public class Test {
    public static void main(String[] args) {

        // Q1

        int[] arr = new int[]{32, 54, 12, 67, 2, 5};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[]{5, 4, 3, 1, 2};
        System.out.println("\nArray elements after sorting:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                int tmp2 = 0;
                if (arr2[i] > arr2[j]) {
                    tmp2 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tmp2;
                }
            }
            System.out.println(arr2[i]);
        }
        int[] arr3 = new int[]{90, 34, 12, 4};
        System.out.println("\nArray elements after sorting:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                int tmp3 = 0;
                if (arr3[i] > arr3[j]) {
                    tmp3 = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = tmp3;
                }
            }
            System.out.println(arr3[i]);

        }

    }
}


