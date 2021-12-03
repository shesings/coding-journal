//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map <String, Integer> phoneBook = new HashMap<String, Integer> ();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        // this just prints out the entire phone book just as a verification
        /*for(Map.Entry<String, Integer> contact : phoneBook.entrySet())
        {
            System.out.print(contact.getKey() + ":");
            System.out.println(contact.getValue());
        }*/
        // once we reach here, phone book is done being read in
        while(in.hasNext())
        {
            String s=in.nextLine(); // this is reading in the contact being queried
            //check if map contains key
            if(phoneBook.containsKey(s))
            {
                // return key=value
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else
            { // else if return "not found"
                System.out.println("Not found");
            }


        }
        //
    }
}



