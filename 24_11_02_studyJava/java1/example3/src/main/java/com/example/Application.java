package com.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("과제 1");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int value1;
        int value2;

        System.out.print("처음 값 입력 = ");
        value1 = sc.nextInt();

        System.out.print("두번째 값 입력 = ");
        value2 = sc.nextInt();
        System.out.println();

        int sum = value1 + value2;
        int sub = value1 - value2;
        int mul = value1 * value2;
        int div = value1 / value2;
        int rem = value1 % value2;

        System.out.println( value1 + " + " + value2 + " = " + sum);
        System.out.println( value1 + " - " + value2 + " = " + sub);
        System.out.println( value1 + " * " + value2 + " = " + mul);
        System.out.println( value1 + " / " + value2 + " = " + div);
        System.out.println( value1 + " % " + value2 + " = " + rem);

        System.out.println();

        System.out.println("과제2");
        System.out.println();

        int m;
        System.out.print("m 입력 = ");
        m = sc.nextInt();
        System.out.println();

        double inch = m * 39.370079;
        double yard = m * 1.093613;
        double mile = m * 0.000621;

        System.out.println("환산된 inch : " + inch);
        System.out.println("환산된 yard : " + yard);
        System.out.println("환산된 mile : " + mile);

        System.out.println();

        System.out.println("과제3");
        System.out.println();

        int x;
        int y;
        int z;

        System.out.print("x 값 입력 = ");
        x = sc.nextInt();

        System.out.print("y 값 입력 = ");
        y = sc.nextInt();

        System.out.print("z 값 입력 = ");
        z = sc.nextInt();

        int xyzoper = (x - y) / (z - y);
        System.out.println("xyzoper : " + xyzoper);

        System.out.println();
    }
}