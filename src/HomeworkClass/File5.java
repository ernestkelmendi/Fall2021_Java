package HomeworkClass;

import java.util.Locale;

public class File5 {
    public static void main(String[] args) {
        String day = "";
        if (day.equalsIgnoreCase("mon")
                || day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("wed")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("fri")
                || day.equalsIgnoreCase("friday")) {
            System.out.println("Today is the Technosoft class");
        } else if (day.equalsIgnoreCase("tue")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("thur")
                || day.equalsIgnoreCase("thursday")) {
            System.out.println("Today is self learning day");
        } else if (day.equalsIgnoreCase("sat")
                || day.equalsIgnoreCase("saturday")) {
            System.out.println("Today is lab session day");

        } else if (day.equalsIgnoreCase("sun")
                || day.equalsIgnoreCase("sunday")) {
            System.out.println("No study today");
        } else {
            System.out.println("Entered day-value is not valid");
        }

        switch (day.toLowerCase()) {
            case "mon":
            case "monday":
            case "wed":
            case "wednesday":
            case "fri":
            case "friday":
                System.out.println("Today is the Technosoft class");
                break;
            case "tue":
            case "tuesday":
            case "thur":
            case "thursday":
                System.out.println("Today is self learning day");
                break;
            case "sat":
            case "saturday":
                System.out.println("Today is lab session day");
                break;
            case "sun":
            case "sunday":
                System.out.println("No study today");
                break;
            default:
                System.out.println("Entered day-value is not valid");
        }

    }
}
