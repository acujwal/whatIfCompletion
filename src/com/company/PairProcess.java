package com.company;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        String sum, product, average;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First Number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Last Number?  : ");
        num2 = keyboard.nextInt();
        {

            System.out.printf("Sum Value : %d%n", num1 + num2);
            System.out.printf("Product Value : %d%n", num1 * num2);
            System.out.printf("Average Value : %d%n", ((num1 + num2) / 2));


           }

    }
    }

