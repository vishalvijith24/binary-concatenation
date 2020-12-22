package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int x = input.nextInt();
        System.out.println("Enter number2");
        int y = input.nextInt();
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        String c = a+b;
        System.out.println("binary X + binary Y is " +c);
        String d = b+a;
        System.out.println("binary y + binary x is " +d);
        int e=Integer.parseInt(c,2);
        int f=Integer.parseInt(d,2);
        System.out.println("num1 + num2 is "+e);
        System.out.println("num2 + num1 is "+f);
        System.out.println(" " +e+ " + " +f+ " = " +(e-f));
    }
}