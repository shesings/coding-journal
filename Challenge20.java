import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /**
     public static void print(int[] array) {

     for(int a : array) {
     System.out.print(a + " ");
     }
     System.out.println();
     }
     **/

    public static int bubbleSort(int[] a, int n){
        int numSwaps = 0;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]){
                    //swap(a[j], a[j+1]);
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps++;
                }
                //print(a);
            }
            if(numSwaps == 0){
                break;
            }
        }

        return numSwaps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numSwaps = bubbleSort(a, n);

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}