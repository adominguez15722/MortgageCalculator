package com;

import java.util.Locale;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//
//        System.out.println("Number: ");
//        int input = number.nextInt();
//        if (input % 5 == 0 && input % 3 == 0)
//            System.out.println("Fizzbuzz");
//        else if (input % 5 == 0)
//            System.out.println("Fizz");
//        else if (input % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(input);


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
