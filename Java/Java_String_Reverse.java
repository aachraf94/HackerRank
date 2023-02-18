import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        char c;

        int n = A.length();
        for (int i = 0; i < n; i++) {
            c = A.charAt(n - i - 1);
            B = B + c;
        }
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
