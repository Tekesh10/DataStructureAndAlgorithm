package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FindMyNumber {

    public static void main(String[] args) {
        Algorithm<Integer> myNumber = new Algorithm<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number N");
        int N = scanner.nextInt();
        System.out.println("Now, Think of a number between 0 and "+N);
        myNumber.findMyNumber(N);
        System.out.println("Found your number");
    }
}
