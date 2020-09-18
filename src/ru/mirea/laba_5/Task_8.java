package ru.mirea.laba_5;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner cin =   new Scanner(System.in);
        String text = cin.nextLine();
        System.out.println(isPalindrome(text, 0, text.length()-1));
    }

    public static String isPalindrome(String text, int x, int y){
        if(x == y){
            return "Yes";
        }
        else if(text.charAt(x) == text.charAt(y)){
            return isPalindrome(text, x+1, y-1);
        }
        else {
            return "No";
        }
    }
}
