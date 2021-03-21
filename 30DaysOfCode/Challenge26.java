import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayReturned = scan.nextInt();
        int monthReturned = scan.nextInt();
        int yearReturned = scan.nextInt();

        //System.out.println("dayReturned: " + dayReturned);
        //System.out.println("monthReturn: " + monthReturned);
        //System.out.println("yearReturned: " + yearReturned);

        int dayDue = scan.nextInt();
        int monthDue = scan.nextInt();
        int yearDue = scan.nextInt();

        //System.out.println("dayDue: " + dayDue);
        //System.out.println("monthDue: " + monthDue);
        //System.out.println("yearReturn: " + yearDue);

        //int totalFine = 0;
        // check if yearReturned > yearDue
        if (yearReturned > yearDue) {
            // return 10,000 HACKOS
            System.out.println("10000");
            //totalFine += 10000;
            // if not, check if monthReturned > monthDue
        } else if (monthReturned > monthDue && (yearReturned == yearDue)) {
            // difference of months * 500 HACKOS
            System.out.println((monthReturned - monthDue)*500);
            //totalFine += ((monthReturned - monthDue)*500);
            // if not, check if daysReturned > dayDue
        } else if (dayReturned > dayDue && (yearReturned == yearDue) && (monthReturned == monthDue)) {
            // difference of day * 15
            System.out.println((dayReturned - dayDue)*15);
            //totalFine += ((dayReturned - dayDue)*15);
        } else {
            System.out.println("0");
        }
        // else
        // no fine :)
        scan.close();
    }
}