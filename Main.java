package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Student student = new Student("Ola", "Jakas", 1234L, 25, Gender.FEMALE);
     Student student1 = new Student("Ola", "Jakas", 1234L, 25, Gender.FEMALE);

     System.out.println(student.equals(student1));

     System.out.println(student);
    }
}
