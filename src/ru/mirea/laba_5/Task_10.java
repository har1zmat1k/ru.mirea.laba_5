package ru.mirea.laba_5;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("X = ");
        int x = cin.nextInt();
        int x_length = (int) (Math.log10(x) + 1);
        System.out.println(palindromeOf(x, x_length));
    }

    public static int palindromeOf(int x, int x_length){
        if(x_length <= 1 || x/x_length == 0){
            return x;
        }
        else {
            return palindromeOf((int) (x % Math.pow(10, x_length-1)),
                    x_length-1) * 10 + (int) (x/Math.pow(10, x_length-1));
        }
    }
}
