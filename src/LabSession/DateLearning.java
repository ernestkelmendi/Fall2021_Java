package LabSession;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateLearning {
    public static void main(String[] args) throws ParseException {

//        Date today = new Date();
//        System.out.println(today);
//        SimpleDateFormat sdf = new SimpleDateFormat("d");
//        String stgToday = sdf.format(today);
//        System.out.println(stgToday);

//        String givenDate = "Fri, Dec 24";
//        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM, dd");
//       Date givenDateData = formatter.parse(givenDate);
//        System.out.println(givenDateData);
//

        Calendar cal = Calendar.getInstance();
        Date calToday = cal.getTime();
        System.out.println(calToday);
        cal.add(Calendar.DAY_OF_MONTH,30);
        Date monthAfter = cal.getTime();
        System.out.println(monthAfter);
        SimpleDateFormat myFormat = new SimpleDateFormat("MMM dd, yyyy");
        String stgMonthAfter = myFormat.format(monthAfter);
        System.out.println(stgMonthAfter);
        String depDate = "tomorrow";
        String retDate = "5 days from tomorrow";
        }
    }