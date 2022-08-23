package com.bridgelabz.algorithm;

public class BubbleSort {

    public static void main(String[] args) {
        Algorithm<Integer> bubbleSort = new Algorithm<>();

        Integer[] array = {23,56,58,2,45,8,1,34,78,65,98,14,95,71};
        System.out.println("Before sorting");
        bubbleSort.print(array);
        bubbleSort.bubbleSort(array);
        System.out.println("After sorting");
        bubbleSort.print(array);
    }
}
