package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();

        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument
        int weekday = myCal.get(Calendar.DAY_OF_WEEK);
        System.out.println("myCal Day of Week: " + weekday );
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.

        //Write similar tests for month, year and day of month.
        int month = myCal.get(Calendar.MONTH) + 1;
        System.out.println("myCal Month: " + month);
        System.out.println("Expected: 9");

        int monthday = myCal.get(Calendar.DAY_OF_MONTH);
        System.out.println("myCal Day of Month: " + monthday);
        System.out.println("Expected: 23");

        int year = myCal.get(Calendar.YEAR);
        System.out.println("myCal Year: " + year);
        System.out.println("Expected: 2020");

        System.out.println("Today's date is " + weekday + "/" + month + "/" + monthday + "/" + year);

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR,100);
        int weekday2 = myCal.get(Calendar.DAY_OF_WEEK);
        int month2 = myCal.get(Calendar.MONTH) + 1;
        int monthday2 = myCal.get(Calendar.DAY_OF_MONTH);
        int year2 = myCal.get(Calendar.YEAR);
        System.out.println("The new date is " + weekday2 + "/" + month2 + "/" + monthday2 + "/" + year2);

        myCal.add(Calendar.DAY_OF_YEAR,-171);
        int weekday3 = myCal.get(Calendar.DAY_OF_WEEK);
        int month3 = myCal.get(Calendar.MONTH) + 1;
        int monthday3 = myCal.get(Calendar.DAY_OF_MONTH);
        int year3 = myCal.get(Calendar.YEAR);
        System.out.println("My birthday was " + weekday3 + "/" + month3 + "/" + monthday3 + "/" + year3);

        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        myCal.add(Calendar.DAY_OF_YEAR,10000);
        int weekday4 = myCal.get(Calendar.DAY_OF_WEEK);
        int month4 = myCal.get(Calendar.MONTH) + 1;
        int monthday4 = myCal.get(Calendar.DAY_OF_MONTH);
        int year4 = myCal.get(Calendar.YEAR);
        System.out.println("The new date is " + weekday4 + "/" + month4 + "/" + monthday4 + "/" + year4);

    }

}