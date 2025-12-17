package String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();
        System.out.println(string.length());
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length()-1));
        System.out.println(string.contains("a"));
    }
}
