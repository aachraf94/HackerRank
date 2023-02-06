/*
In this challenge, you must read an integer, a double, and a String from stdin, then
print the values according to the instructions in the Output Format section below. To
make the problem a little easier, a portion of the code is provided for you in the editor.
*/

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Int : ");
        int i = scan.nextInt();
        System.out.print("Double : ");
        Double d = scan.nextDouble();
        scan.nextLine();
        System.out.print("String : ");
        String s = scan.nextLine();
        scan.close();

        System.out.println("\nString: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
