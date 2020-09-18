package ru.mirea.laba_5;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner cin =   new Scanner(System.in);
        System.out.println("A = ");
        int x = cin.nextInt();
        System.out.println("B = ");
        int y = cin.nextInt();
        if(x+y != 0){
            System.out.println(Fun(x,y));
        }
        else {
            System.out.println(0);
        }
    }

    public static  int Fun(int x, int y){
        if(x > y+1){ return 0;}
        if(x == 0 || y == 0){ return 1;}
        return Fun(x,y-1) + Fun(x-1, y-1);
    }
}
