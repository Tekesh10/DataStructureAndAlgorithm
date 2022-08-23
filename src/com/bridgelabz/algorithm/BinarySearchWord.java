package com.bridgelabz.algorithm;

public class BinarySearchWord {
    public static void main(String[] args) {
        Algorithm<String> binarySearch = new Algorithm<>();

        String[] fruits = {"Orange","Apple","Mango","Banana","Peach","Guava","Strawberry"};
        binarySearch.insertionSort(fruits);
        binarySearch.print(fruits);
        binarySearch.binarySearch(fruits, "Mango");
    }
}
