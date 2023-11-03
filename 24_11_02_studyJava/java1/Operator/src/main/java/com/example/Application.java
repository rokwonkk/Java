package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        /**
         *  Operator (연산자)
         *  + - * / %
         *  / -> 몫
         *  % -> 나머지
         *
         */

        int num1, num2;
        int result;

        num1 = 25;
        num2 = 7;

        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        //몫
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);

        //나머지
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);

        // 주의점 / % -> 0으로 나누는 것은 불가하기 때문에(문제가 발생함.) 분기 태워주어야 함.
        num1 = 3;
        num2 = 0;
        //result = num1 / num2;

        //자기 자신(변수)의 값을 갱신
        int number = 1;
        number = number + 1;
        System.out.println(number);

        number += 1;
        System.out.println(number);

        //increment(증가) ++, decrement(감소) --
        number++; // number = number + 1;
        ++number; // number = number + 1;
        System.out.println(number);

        number--; // number = number - 1;
        --number; // number = number - 1;
        System.out.println(number);

        //주의점
        //일반 연산자와 increment를 같이 사용하는 경우
        number = 1;

        int tag;
        tag = number++;
        System.out.println("tag:" + tag + " number:" + number);

        number = 1;
        tag = ++number;
        System.out.println("tag:" + tag + " number:" + number);

        number = 1;
        tag = (number++);
        System.out.println("tag:" + tag + " number:" + number);

        //result = a + b * c
        int a, b, c;
        a = 2;
        b = 3;
        c = 4;
        result = a + b * c;
        System.out.println(result);
    }
}