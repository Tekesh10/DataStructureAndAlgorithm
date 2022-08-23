package com.bridgelabz.algorithm;

public class AnagramDetection {

    public static void main(String[] args) {
        Algorithm<Character> anagram = new Algorithm<>();
        if (anagram.Anagram("earth","heart")) {
            System.out.println("The two words are anagram");
        } else {
            System.out.println("The two words are Not anagram");
        }
    }
}
