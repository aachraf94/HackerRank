import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = "" + A.charAt(0);
        s1 = s1.toUpperCase();
        s1 = s1 + A.substring(1, A.length());

        String s2 = "" + B.charAt(0);
        s2 = s2.toUpperCase();
        s2 = s2 + B.substring(1, B.length());

        System.out.println(s1 + " " + s2);
    }
}