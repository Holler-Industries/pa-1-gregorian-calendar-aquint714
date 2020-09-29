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
        String weekday0 = null;
        if (weekday == 1) {
            weekday0 = "Sunday";
        }
        if (weekday == 2) {
            weekday0 = "Monday";
        }
        if (weekday == 3) {
            weekday0 = "Tuesday";
        }
        if (weekday == 4) {
            weekday0 = "Wednesday";
        }
        if (weekday == 5) {
            weekday0 = "Thursday";
        }
        if (weekday == 6) {
            weekday0 = "Friday";
        }
        if (weekday == 7) {
            weekday0 = "Saturday";
        }

        System.out.println("myCal Day of Week: " + weekday0);
        System.out.println("Expected: Friday");     //Note: 1 = Sunday, 2 = Monday, etc.

            //Write similar tests for month, year and day of month.
        int month = myCal.get(Calendar.MONTH) + 1;
        System.out.println("myCal Month: " + month);
        System.out.println("Expected: 9");

        int monthday = myCal.get(Calendar.DAY_OF_MONTH);
        System.out.println("myCal Day of Month: " + monthday);
        System.out.println("Expected: 25");

        int year = myCal.get(Calendar.YEAR);
        System.out.println("myCal Year: " + year);
        System.out.println("Expected: 2020");

        System.out.println("Today's date is " + weekday0 + " " + month + "/" + monthday + "/" + year);
        myCal.add(Calendar.DAY_OF_YEAR, 2);

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR, 100);
        int weekday2 = myCal.get(Calendar.DAY_OF_WEEK);
        int month2 = myCal.get(Calendar.MONTH) + 1;
        int monthday2 = myCal.get(Calendar.DAY_OF_MONTH);
        int year2 = myCal.get(Calendar.YEAR);
        String weekday20 = null;
        if (weekday2 == 1) {
            weekday20 = "Sunday";
        }
        if (weekday2 == 2) {
            weekday20 = "Monday";
        }
        if (weekday2 == 3) {
            weekday20 = "Tuesday";
        }
        if (weekday2 == 4) {
            weekday20 = "Wednesday";
        }
        if (weekday2 == 5) {
            weekday20 = "Thursday";
        }
        if (weekday2 == 6) {
            weekday20 = "Friday";
        }
        if (weekday2 == 7) {
            weekday20 = "Saturday";
        }
        System.out.println("The new date is " + weekday20 + " " + month2 + "/" + monthday2 + "/" + year2);

        myCal = new GregorianCalendar(2020, 06, 14);
        int weekday3 = myCal.get(Calendar.DAY_OF_WEEK);
        int month3 = myCal.get(Calendar.MONTH) + 1;
        int monthday3 = myCal.get(Calendar.DAY_OF_MONTH);
        int year3 = myCal.get(Calendar.YEAR);
        String weekday30 = null;
        if (weekday3 == 1) {
            weekday30 = "Sunday";
        }
        if (weekday3 == 2) {
            weekday30 = "Monday";
        }
        if (weekday3 == 3) {
            weekday30 = "Tuesday";
        }
        if (weekday3 == 4) {
            weekday30 = "Wednesday";
        }
        if (weekday3 == 5) {
            weekday30 = "Thursday";
        }
        if (weekday3 == 6) {
            weekday30 = "Friday";
        }
        if (weekday3 == 7) {
            weekday30 = "Saturday";
        }
        System.out.println("My birthday was " + weekday30 + " " + month3 + "/" + monthday3 + "/" + year3);

        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        myCal.add(Calendar.DAY_OF_YEAR, 10000);
        int weekday4 = myCal.get(Calendar.DAY_OF_WEEK);
        int month4 = myCal.get(Calendar.MONTH) + 1;
        int monthday4 = myCal.get(Calendar.DAY_OF_MONTH);
        int year4 = myCal.get(Calendar.YEAR);
        String weekday40 = null;
        if (weekday4 == 1) {
            weekday40 = "Sunday";
        }
        if (weekday4 == 2) {
            weekday40 = "Monday";
        }
        if (weekday4 == 3) {
            weekday40 = "Tuesday";
        }
        if (weekday4 == 4) {
            weekday40 = "Wednesday";
        }
        if (weekday4 == 5) {
            weekday40 = "Thursday";
        }
        if (weekday4 == 6) {
            weekday40 = "Friday";
        }
        if (weekday4 == 7) {
            weekday40 = "Saturday";
        }
        System.out.println("10,000 days past my 2020 birthday is " + weekday40 + " " + month4 + "/" + monthday4 + "/" + year4);

    }

}