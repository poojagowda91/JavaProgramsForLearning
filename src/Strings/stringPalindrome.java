package Strings;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args)
    {
        String original,reverse= "";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        original = scn.nextLine();
        int length = original.length();
        for(int i = length-1;i>=0;i--)
        {
            reverse = reverse+original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}

