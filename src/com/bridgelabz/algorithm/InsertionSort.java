package com.bridgelabz.algorithm;

public class InsertionSort {

    public static void main(String[] args) {
        Algorithm<String> insertionSort = new Algorithm<>();

        String[] fruits = {"Orange","Apple","Mango","Banana","Peach","Guava","Strawberry"};
        System.out.println("Before sorting");
        insertionSort.print(fruits);
        insertionSort.insertionSort(fruits);
        System.out.println("After sorting");
        insertionSort.print(fruits);
    }
}
