import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        ArrayList<Integer> divisorList = new ArrayList();
        int sum = 0;
        // find all divsors
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                divisorList.add(i);
            }
        }

        // add them all up
        for(int divisor : divisorList){
            sum += divisor;
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}