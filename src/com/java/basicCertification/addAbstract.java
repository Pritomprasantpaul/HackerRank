package com.java.basicCertification;
import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator{
    @Override
    int add(int a, int b) {
        // TODO Auto-generated method stub
        return a+b;
    }
}
/*
 Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
 */
public class addAbstract {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}