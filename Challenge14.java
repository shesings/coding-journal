import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        int lowestNum = elements[0];
        int largestNum = 0;

        for(int num : elements){
            if(num > largestNum){
                largestNum = num;
            } else if (num < lowestNum) {
                lowestNum = num;
            }
        }

        //System.out.println("largestNum: " + largestNum);
        //System.out.println("lowestNum: " + lowestNum);
        this.maximumDifference = largestNum-lowestNum;
        //Math.abs
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}