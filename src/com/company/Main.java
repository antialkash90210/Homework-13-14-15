package com.company;

import java.util.Scanner;

//9.43
public class Main {

    public static void main(String[] args) {
        String string1;
        String string2 = "";


        Scanner input = new Scanner(System.in);

        string1 = input.next();



        for (int i = 0; i < string1.length(); i++) {
            if (i%2 != 0)
            {
                string2+= string1.charAt(i);
            }
        }

        System.out.println(string2);


    }
}