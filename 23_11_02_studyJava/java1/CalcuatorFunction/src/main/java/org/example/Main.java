package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("과제 25");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("첫 번째 값 입력 >> ");
//        int value = sc.nextInt();
//        System.out.println("입력하신 정수 1은 : " + value + "입니다.");
//
//        System.out.print("두 번째 값 입력 >> ");
//        int value2 = sc.nextInt();
//        System.out.println("입력하신 정수 2는 : " + value2 + "입니다.");
//
//        System.out.print("(+, -, *, /) 중 하나를 입력 >> ");
//        String operator = sc.next();
//
//        // calculator(value, value2, operator);
//        int result = calculatorUpgrade(value, value2, operator);
//        System.out.println("result : " + result);

        /*************************************************************************************/


        // 첫번째 입력
        int number1 = numberInput("첫번째");

        String oper = operatorInput();

        int number2 = numberInput("두번째");

        // calculator
        int result = calculator2(number1, number2, oper);

        // print
        System.out.println(number1 + " " + oper + " " + number2 + " = " + result);
    }

    static void calculator(int value, int value2, String operator) {
        switch (operator) {
            case "+" -> System.out.println(value + " - " + value2 + " = " + (value + value2));
            case "-" -> System.out.println(value + " - " + value2 + " = " + (value - value2));
            case "*" -> System.out.println(value + " * " + value2 + " = " + (value * value2));
            case "/" -> System.out.println(value + " / " + value2 + " = " + (value / value2));
            default -> {
                System.out.println("연산자가 잘못 입력되었습니다.");
            }
        }
    }

    static int calculatorUpgrade(int value, int value2, String operator) {
        int result = 0;
        switch (operator) {
            case "+" : result = (value + value2); break;
            case "-" : result = (value - value2); break;
            case "*" : result = (value * value2); break;
            case "/" : result = (value / value2); break;
        }
        return result;
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

    static int numberInput(String message){

        Scanner sc = new Scanner(System.in);

        int number = 0;
        while(true) {
            System.out.print(message + " 수 = ");
            String numStr1 = sc.next();

            // 숫자인지 검사
            boolean isNum = isNumber(numStr1);

            // 문자열 -> 숫자
            if(isNum) {	// 정상적으로 숫자가 입력된 경우
                number = Integer.parseInt(numStr1);
                break;
            }
            System.out.println("정확히 숫자를 입력해 주십시오");
        }
        return number;
    }
    static String operatorInput(){
        Scanner sc = new Scanner(System.in);

        String oper = "";
        while (true) {
            System.out.print("(+, -, *, /) = ");
             oper = sc.next();

            // 연산자 인지 검사.
            if (oper.equals("+") || oper.equals("-") ||
                    oper.equals("*") || oper.equals("/")) {
                break;
            }
            System.out.println("연산자를 정확히 기입해 주세요");
        }

        return oper;
    }

    // 모두 숫자인지 아닌지 검사하는 Utility 함수
    static boolean isNumber(String number){
        boolean isNum = true;
        for (int i = 0; i < number.length(); i++) {
            int n = number.charAt(i);
            if(n < 48 || n > 57) {
                isNum = false;
                break;
            }
        }
        return isNum;
    }
}