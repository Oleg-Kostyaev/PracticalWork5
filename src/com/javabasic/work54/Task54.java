package com.javabasic.work54;

import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1 --> ");
        String strIn1 = sc.nextLine();
        System.out.print("Enter string1 --> ");
        String strIn2 = sc.nextLine();

        System.out.print("Output char: ");
        int i = 0;
        while (i<strIn1.length()){
            if (strIn2.indexOf(strIn1.charAt(i))<0) {
                System.out.print(strIn1.charAt(i)+";");
            }
            i++;
        }
    }
}
