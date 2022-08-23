package com.bridgelabz.algorithm;

public class Algorithm<K> {

    public void insertionSort(String[] array) {
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

    public void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

    public boolean Anagram(String word1, String word2) {
        char[] wordArray1 = this.splitWord(word1);
        char[] wordArray2 = this.splitWord(word2);

        int lengthWord1 = wordArray1.length;
        int lengthWord2 = wordArray2.length;

        if (lengthWord1 != lengthWord2)
            return false;

        this.sort(wordArray1);
        this.sort(wordArray2);

        for (int i = 0; i < lengthWord1; i++) {
            if (wordArray1[i] != wordArray2[i]) {
                return false;
            }
        }
        return true;
    }

    private char[] splitWord(String word) {
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
            arr[i] = word.charAt(i);
        return arr;
    }
    private void sort(char[] arr) {

        for (int i = 1; i < arr.length; i++) {
            char value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > (value)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
    public void print(K[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }
}