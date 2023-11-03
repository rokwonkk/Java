package com.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money1; // 지불해야될 금액
        int money2; // 자신이 지불한 금액

        int result5000 = 0; //거스름돈 5000
        int result1000 = 0; //거스름돈 1000
        int result500 = 0; //거스름돈 500
        int result100 = 0; //거스름돈 100
        int result50 = 0; //거스름돈 50
        int result10 = 0; //거스름돈 10

        System.out.print("입력 = ");
        money1 = sc.nextInt();
        System.out.println("지불해야될 금액은 : " + money1 + "원 입니다.");

        System.out.print("입력 = ");
        money2 = sc.nextInt();
        System.out.println("자신이 지불한 금액은 : " + money2 + "원 입니다.");
        System.out.println();

        int result;
        result = money2 - money1;

        result5000 = result / 5000;
        result1000 = (result % 5000) / 1000;
        result500 = (result % 1000) / 500;
        result100 = (result % 500) / 100;
        result50 = (result % 100) / 50;
        result10 = (result % 50) / 10;

        System.out.println("거스름돈은 " + result + "원 입니다.");
        System.out.println();
        System.out.println("5000원 : " + result5000 + "장 입니다.");
        System.out.println("1000원 : " + result1000 + "장 입니다.");
        System.out.println("500원 : " + result500 + "개 입니다.");
        System.out.println("100원 : " + result100 + "개 입니다.");
        System.out.println("50원 : " + result50 + "개 입니다.");
        System.out.println("10원 : " + result10 + "개 입니다.");

    }
}