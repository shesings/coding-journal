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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int exponent = 0;
        int check = 0;
       
        // find the largest binary number that is just under n
        while (check < n) {
            if (n > check) {
                exponent++;
                check = (int) Math.pow(2, exponent);
            } 
        }
        exponent--;
        check = (int) Math.pow(2, exponent);
        // subtract n from the greatest binary number found
        // keep subtracting until 0 is reached
        String binary = "";
        while (n != 0){
            if(n < check) {
                binary = binary + "0";
                exponent--;
                check = (int) Math.pow(2, exponent);
            } else { // n >= check
                n = n - check;
                exponent --;
                check = (int) Math.pow(2, exponent);
                binary = binary + "1";
            }
        }      
        // once binary number is found -- need to find greatest amount
        // of secutive 1's
        char chara; 
        int currentMax = 0;
        int counter = 0;
        int i = 0;
        while (i < binary.length()) {
            chara = binary.charAt(i);
            if (chara == '1'){
                counter++;
            } else { // "0"
                counter = 0;
            }
            currentMax = Math.max(currentMax, counter);
            i++;
            if (i == binary.length()) {
                currentMax = Math.max(currentMax, counter);
                System.out.println(currentMax);
                return;
            } 
        }
        scanner.close();
    }
}
