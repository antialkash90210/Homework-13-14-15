package com.company;

public class Task9_37 {
    public static void main(String[] args) {
        String word = "Россия";
        String part1 = "";
        String part2 = "";


        for (int i = 0; i < word.length(); i++) {
            if (i < (word.length() / 2)) {
                part2 += word.charAt(i);
            }
            else if (i >= (word.length() / 2)) {

                part1 += word.charAt(i);
            }

        }

        System.out.println(part1 + part2);
    }
}