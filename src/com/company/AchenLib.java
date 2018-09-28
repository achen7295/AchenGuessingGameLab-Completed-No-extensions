package com.company;
import java.util.Scanner;

public class AchenLib {

    public static void linearSearch() {

        int num = (int) (Math.random() * 100);
        System.out.println("Guess a number from 1 - 100");
        Scanner guess = new Scanner(System.in);
        while ((guess.nextInt() != num)) {
            System.out.print("This is not the correct number");
        }
        System.out.println("This is the correct number!");
    }

    public static void binarySearch() {
        int start = 1;
        int end = 100;
        System.out.println("I will guess your number!");
        int num = (start + end) / 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Is your number " + num + "?");
        System.out.println("If your number is higher, input higher. If it is lower, input lower");
        String response = input.nextLine();
        while (response.equals("higher") || response.equals("lower")) {
            if (response.equals("higher")) {
                start = num + 1;
                num = (start + end) / 2;
                System.out.println("Is " + num + " your number?");
                response = input.nextLine();
            } else {
                end = num - 1;
                num = (start + end) / 2;
                System.out.println("Is " + num + " your number?");
                response = input.nextLine();
            }
        }
        System.out.println("Your number is " + num);
    }
}

