package com.javabasic.work51;

import java.util.Scanner;

public class Task51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string --> ");
        String str = sc.nextLine();
        System.out.print("Second half of string: ");
        System.out.println(str.substring(str.length()/2));
    }
}
