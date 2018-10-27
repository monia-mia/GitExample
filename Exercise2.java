package com.company;

public class Exercise2 {
    public static void main(String[] args) {
        String[] array = {"Ela", "Ola", "Ala"};
        int sum =0;
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i].toLowerCase());

            sum += array[i].length();
        }
        System.out.println("Sum of charackters: " + sum);
    }
}
