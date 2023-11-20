package CalculatorOOP.cal;

import java.util.Scanner;

public class Calculator {

    int num1, num2;
    String oper;
    int result;

    public void input(){

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수 = ");
        num1 = sc.nextInt();

        System.out.println("(+, -, *, /) = ");
        oper = sc.next();

        System.out.println("두번째 수 = ");
        num2 = sc.nextInt();
    }

    public void process(){
        switch (oper){
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
    }

    public void print(){
        System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
