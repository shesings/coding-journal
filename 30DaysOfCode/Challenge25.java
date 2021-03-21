import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        boolean flag = true;
        for(int i=2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            int n = scan.nextInt();
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scan.close();

    }


}



