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

        for (int i = 0; i < 6; i++) { // reads in 6 rows
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) { // for every row
                // fills into 2D array
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        // arr is now set with input
        int sum = 0;
        int temp = 0;
        List<Integer> hourglassValues = new ArrayList<Integer>();
        // gather the hourglass numbers for each

        for (int x = 0; x < 4; x++) {
            sum = 0;

            for(int y = temp; y < temp+3; y++) {
                System.out.println("arr[" + x + "][" + y + "]: " + arr[x][y]);

                hourglassValues.add(arr[x][y]);
            }
            System.out.println("arr[" + (x+1) + "][" + (x+1) + "]: " + arr[x+1][x+1]);
            hourglassValues.add(arr[x+1][x+1]);
            x++;
        }

        // hourglassSum

        scanner.close();
    }
}
