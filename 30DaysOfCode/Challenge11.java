import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int row = 6;
        int col = 6;
        for (int i = 0; i < 6; i++) { // reads in 6 rows
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) { // for every row
                // fills into 2D array
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        if (row < 3 || col < 3)
            System.out.println("-1");

        // top left cells of hour glasses.
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < row - 2; i++)
        {
            for (int j = 0; j < col - 2; j++)
            {
                int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1]) +
                        (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println(max_sum);
        scanner.close();
    }
}
