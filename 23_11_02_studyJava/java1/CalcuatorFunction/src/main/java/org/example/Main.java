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

        /*************************************************************************************/

//        Scanner sc = new Scanner(System.in);
//
//        int number1 = 0;
//
//        while(true) {
//            System.out.print("첫번째 수 = ");
//            String numStr1 = sc.next();
//
//            // 숫자인지 검사
//            boolean isNum = true;
//            for (int i = 0; i < numStr1.length(); i++) {
//                int n = numStr1.charAt(i);
//                if(n < 48 || n > 57) {
//                    isNum = false;
//                    break;
//                }
//            }
//
//            // 문자열 -> 숫자
//            if(isNum) {	// 정상적으로 숫자가 입력된 경우
//                number1 = Integer.parseInt(numStr1);
//                break;
//            }
//
//            System.out.println("정확히 숫자를 입력해 주십시오");
//        }
//
//        System.out.print("(+, -, *, /) = ");
//        String oper = sc.next();
//
//        System.out.print("두번째 수 = ");
//        int number2 = sc.nextInt();
//
//        // calculator
////		int result = 0;
////		switch(oper) {
////			case "+":
////				result = number1 + number2;
////				break;
////			case "-":
////				result = number1 - number2;
////				break;
////			case "*":
////				result = number1 * number2;
////				break;
////			case "/":
////				result = number1 / number2;
////				break;
////		}
//        int result = calculator2(number1, number2, oper);
//
//        // print
//        System.out.println(number1 + " " + oper + " " + number2 + " = " + result);
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

    static int calculator2(int num1, int num2, String oper) {
        int result = 0;
        switch(oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}