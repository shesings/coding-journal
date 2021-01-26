import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
      //int mealCost = (int) Math.round(meal_cost);
      //System.out.println("mealCost: " + mealCost);
      double tipCost = (tip_percent*.01) * meal_cost;
      //System.out.println("tipCost: " + tipCost);
      double taxCost = (tax_percent*.01) * meal_cost;
      //System.out.println("taxCost: " + taxCost);
      int totalCost = (int) Math.round(meal_cost + tipCost + taxCost);
      System.out.println(totalCost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        // why is it doing this skip?
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
