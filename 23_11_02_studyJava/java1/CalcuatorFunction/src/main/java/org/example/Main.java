package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("과제 25");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 값 입력 >> ");
        int value = sc.nextInt();
        System.out.println("입력하신 정수 1은 : " + value + "입니다.");

        System.out.print("두 번째 값 입력 >> ");
        int value2 = sc.nextInt();
        System.out.println("입력하신 정수 2는 : " + value2 + "입니다.");

        System.out.print("(+, -, *, /) 중 하나를 입력 >> ");
        String operator = sc.next();

        calculator(value, value2, operator);
    }

    static void calculator(int value, int value2, String operator) {
        switch (operator) {
            case "+" -> System.out.println(value + " + " + value2 + " = " + (value + value2));
            case "-" -> System.out.println(value + " - " + value2 + " = " + (value - value2));
            case "*" -> System.out.println(value + " * " + value2 + " = " + (value * value2));
            case "/" -> System.out.println(value + " / " + value2 + " = " + (value / value2));
            default -> {
                System.out.println("연산자가 잘못 입력되었습니다.");
            }
        }
    }
}