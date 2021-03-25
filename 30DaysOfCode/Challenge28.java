import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Challenge28 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> nameList = new ArrayList();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            // if emailID ends with @gmail.com then save to key map?
                // e-mail = key, name = value
            String regEx = "@gmail.com$";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(emailID);
            if( m.find() ) {
                //System.out.println( emailID );
                nameList.add(firstName);
            }   
        }
        Collections.sort(nameList);
        for(String name : nameList) {
            System.out.println(name);
        }
        scanner.close();
    }
}
