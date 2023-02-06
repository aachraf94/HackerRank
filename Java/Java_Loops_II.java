import java.util.*;
import java.io.*;

class Java_Loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            // String Afficher = "";        //2nd methode
            for (int j = 0; j < n; j++) {
                c += (int) (Math.pow(2, j)) * b;
                System.out.print(Integer.toString(c) + ' ');
                /*
                 * if (j != 0) {
                 * Afficher = Afficher + " " + c;
                 * } else {
                 * Afficher = Afficher+ c;
                 * }
                 */
            }
            System.out.print("\n");
        }
        in.close();
    }
}