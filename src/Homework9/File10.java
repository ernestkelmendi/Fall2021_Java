package Homework9;

import java.util.HashSet;
import java.util.Set;
import java.lang.*;

//  Q1. Create a method that can find if the given array has any duplicates data or not.

public class File10 {
    public static void main(String[] args) {
        String[] names = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println("Duplicate elements from array");
        Set<String> store = new HashSet<>();

        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("found a duplicate element in array : " + name);


            }
        }






    }

}