package com.company;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        System.out.println("Get first number: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y;
        do {
            System.out.println("Get second number: ");
            y = scanner.nextInt();
        }while(y ==0);
        double z = (double) x/y;
        System.out.println("You choose : " + z);
    }
}
