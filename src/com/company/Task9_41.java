package com.company;
import java.util.Scanner;

public class Task9_41 {
    public static void main(String[] args) {
        String s1 = "";
        int length = 0;
        s1 = "Cork City Football Club";
        length = s1.length();

        for (int i = 0; i < length; i++) {
            System.out.println(s1.charAt(i));
        }
    }
}