package CodeTest;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        // Q4

        int[] arr = new int[]{23, 54, 67, 12, 34, 56};
        int j = 23;
        System.out.println("\nBefore deletion :" + Arrays.toString(arr));
        System.out.println("Number to be removed = 23");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                count++;

                for (int k = i; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                i--;
            }
        }

        System.out.print("After Deletion :");
        for (int i = 0; i < arr.length - count; i++) {
            System.out.print(" " + arr[i]);
        }


        int[] arr2 = new int[]{23, 5, 67, 87, 10, 5, 34, 98, 66};
        int j2 = 5;
        System.out.println("\nBefore deletion :" + Arrays.toString(arr2));
        System.out.println("Number to be removed = 5");

        int count2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == j2) {
                count2++;

                for (int k = i; k < arr2.length - 1; k++) {
                    arr2[k] = arr2[k + 1];
                }
                i--;
            }
        }

        System.out.print("After Deletion :");
        for (int i = 0; i < arr2.length - count2; i++) {
            System.out.print(" " + arr2[i]);


        }

        int[] arr3 = new int[]{22, 33, 44, 55};
        int j3 = 11;
        System.out.println("\nBefore deletion :" + Arrays.toString(arr3));
        System.out.println("Number to be removed = 11");

        int count3 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == j3) {
                count3++;

                for (int k = i; k < arr3.length - 1; k++) {
                    arr3[k] = arr3[k + 1];
                }
                i--;
            }
        }

        System.out.print("After Deletion :");
        for (int i = 0; i < arr3.length - count3; i++) {
            System.out.print(" " + arr3[i]);

        }
    }

}