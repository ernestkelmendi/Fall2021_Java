package Homework9;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class File11 {

    //  Q2. Create a method that would return the values occuring more than one time in given string-array.

    static void printRepeating(String[] arr, int n)
    {

        Map<String, Integer> map
                = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            try {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            catch (Exception e) {
                map.put(arr[i], 1);
            }
        }

        for (Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        String[] words = { "happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy" };
        int n = words.length;
        printRepeating(words, n);
    }
}
