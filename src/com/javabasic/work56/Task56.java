package com.javabasic.work56;

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string -> ");
        String strIn = sc.nextLine();
        System.out.print("Enter find string -> ");
        String strFind = sc.nextLine();
        int cnt = strIn.replaceAll("[^"+strFind+"]","").length();
        System.out.println("Count: "+cnt);
        System.out.println(strIn.replaceAll("[^"+strFind+"]",""));

        System.out.println(strIn.matches("\\D{4}"));

    }
}
