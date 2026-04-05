package src.day02;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING TO CHECK PALINDROME = ");
        String first = sc.next();
        boolean result = checkPalindrome(first);
        if(!result){
            System.out.println("not palindrome");
        }else{
            System.out.println("palindrome");
        }
    }

    private static boolean checkPalindrome(String first) {
        String test = reverseString(first);
        return first.equalsIgnoreCase(test);
    }

    private static String reverseString(String first) {
        StringBuilder sb = new StringBuilder();

        for(int i = first.length() - 1; i >= 0; i--) {
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }

}
