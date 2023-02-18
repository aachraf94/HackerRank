import java.util.HashMap;
import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Convert the strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create two HashMaps to store the frequency of characters in the strings
        HashMap<Character, Integer> charCountA = new HashMap<>();
        HashMap<Character, Integer> charCountB = new HashMap<>();

        // Iterate through the first string and store the frequency of each character in
        // the HashMap
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (charCountA.containsKey(c)) {
                charCountA.put(c, charCountA.get(c) + 1);
            } else {
                charCountA.put(c, 1);
            }
        }

        // Iterate through the second string and store the frequency of each character
        // in the HashMap
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (charCountB.containsKey(c)) {
                charCountB.put(c, charCountB.get(c) + 1);
            } else {
                charCountB.put(c, 1);
            }
        }

        // Compare the two HashMaps to see if they are equal
        if (charCountA.equals(charCountB)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
