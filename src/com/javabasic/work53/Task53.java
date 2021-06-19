package com.javabasic.work53;

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a few word --> ");
        String strIn = sc.nextLine();
        String lastWord = strIn.substring(strIn.lastIndexOf(" ")+1);
        String firstWord = strIn.substring(0,strIn.indexOf(" "));
        String middleStr = strIn.substring(strIn.indexOf(" "), strIn.lastIndexOf(" "));
        System.out.println(lastWord+middleStr+" "+firstWord);
    }
}
