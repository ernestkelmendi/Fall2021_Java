package Homework8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Student {

    private String name;
    private int age;
    private String state;
    private String courseName;
    private int yourStudentId;
    private static int studentId = 0;
    private String[] courseNames = {"QA", "PM", "BA", "Developer"};
    private String[] stateNames = {"NY", "CT", "WA", "PA"};
    private Scanner input = new Scanner(System.in);

    public void enroll() {
        System.out.println("Please enter your age in years:");
        int sAge = input.nextInt();
        if (sAge < 16) {
            System.out.println("Sorry, you are under age.");
        } else {
            boolean isCourseValid = false;
            System.out.println("Please enter the course in which you want to enroll:");
            String sCourseName = input.next();
            for (String cName : courseNames) {
                if (cName.equalsIgnoreCase(sCourseName)) {
                    isCourseValid = true;
                    System.out.println("Please enter your name:");
                    name = input.next();
                    age = sAge;
                    System.out.println("Please enter your state:");
                    state = input.next();
                } else {
                    boolean isStateValid = false;
                    System.out.println("--");
                    state = input.next();
                    courseName = sCourseName;
                    yourStudentId = ++studentId;

                    break;
                }
            }
            if (isCourseValid) {
                System.out.println("\n\nHey, thank you " + name + " for the enrollment\nYour student-id: " + yourStudentId);
            } else {
                System.out.println("\n\nIncorrect course name provided.\nProvided course name: " + sCourseName + "\nValid course names: " + Arrays.toString(courseNames));
            }


            }
        }

    public void changeState(String newState) {
        state = newState;

    }

    public void changeName(String newName) {
        if (name.equalsIgnoreCase(newName)) {
            System.out.println("Please enter new name");
        } else {
            name = newName;
            System.out.println("Name changed successfully");
        }
    }

    public void showDetailSummary() {
        System.out.println("\nTo see detail summary, please enter the id: ");
        int id = input.nextInt();
        if (id == yourStudentId) {
            System.out.println("\n**** Detail Student summary: ***\nName : " + name +
                    "\nStudent id : " + yourStudentId +
                    "\nAge : " + age +
                    "\nState : " + state +
                    "\nCourse name : " + courseName);
        } else {
            System.out.println("Please enter your correct id value. Incorrect id entered: " + id);
        }
    }






}