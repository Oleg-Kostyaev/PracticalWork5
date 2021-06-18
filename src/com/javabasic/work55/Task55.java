package com.javabasic.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string --> ");
        String strIn = sc.nextLine();

        System.out.print("Output uniquer chars: ");
        int i = 0;
        while (i<strIn.length()){
            if (strIn.indexOf(strIn.charAt(i)) == strIn.lastIndexOf(strIn.charAt(i))) {
                System.out.print(strIn.charAt(i)+";");
            }
            i++;
        }
    }
}
