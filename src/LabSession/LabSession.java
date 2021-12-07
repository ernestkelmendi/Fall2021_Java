package LabSession;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LabSession {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("An exception happened");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
        } finally {
            System.out.println("You reached to finally block.");
        }


        System.out.println("Have a great weekend!!");
    }
}
