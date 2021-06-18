package com.javabasic.work52;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter organisation name --> ");
        String strIn = sc.nextLine();
        String[] words = strIn.split(" ");
        String strOut = "";
        int i = 0;
        while (i<words.length){
            strOut += words[i].charAt(0);
            i++;
        }
        System.out.print("Short organisation name: ");
        System.out.println(strOut);
    }
}
