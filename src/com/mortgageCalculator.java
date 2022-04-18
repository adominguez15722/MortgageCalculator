package com;

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Number: ");
        int input = number.nextInt();
        if (input % 5 == 0 && input % 3 == 0)
            System.out.println("Fizzbuzz");
        else if (input % 5 == 0 && input % 3 > 0)
            System.out.println("Fizz");
        else if (input % 5 > 0 && input % 3 == 0)
            System.out.println("Buzz");
        else {
            System.out.println(input);
        }
    }
}
