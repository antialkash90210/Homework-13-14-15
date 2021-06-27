package com.company;

import java.util.Scanner;

public class Task_9_16 {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Введи слово более чем из 4 и более букв");
        word = input.next();


        if(word.charAt(1) == word.charAt(3)){
            System.out.println("2 символ и 4 символ одинаковы");


        }
        else {
            System.out.println( "символы не одинаковы");
        }

    }
}