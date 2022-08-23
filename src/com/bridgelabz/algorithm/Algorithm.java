package com.bridgelabz.algorithm;

public class Algorithm<K> {

    public void sort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(value) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
        }
    }
    public void binarySearch(String[] array, String searchWord) {
        Integer mid = binarySearchRecursively(array, 0, array.length, searchWord);
        if (mid >= 0) {
            System.out.println("Word Found");
        } else {
            System.out.println("Word not Found");
        }
    }
    private Integer binarySearchRecursively(String[] array, int left, int right, String searchWord) {
        int mid = left + (right - left) / 2;
        if (array[mid].equals(searchWord)) {
            return mid;
        }
        if (searchWord.compareTo(array[mid]) < 0) {
            return binarySearchRecursively(array, left, mid - 1, searchWord);
        }
        return binarySearchRecursively(array, mid + 1, right, searchWord);
    }
    public void print(K[]array) {
        for (int i = 0; i < array.length; i++)  {
            System.out.println(array[i]+" ");
        }
        System.out.println("\n");
    }
}
