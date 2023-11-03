package com.example;

public class MainClass {
    public static void main(String[] args) {
        /*
            숫자(상수) : 정해진 숫자. 12, 45, ...
                2진수     0,1
                8진수     0 ~ 7 -> 8 == 10 => 010
                10진수    0 ~ 9
                16진수    0 ~ 9 A B C D E F(15)

            변수(variable) : 변경되는 수
                별명을 작명해서 그 이름에 값을 넣는다.
                그릇(크기, 자료형)
                변수의 작명은 선택

                자료형 변수명;    <- 변수 선언
                변수명 = 값;      <- 대입

                int number;
                number = 135;

         */

        int number;
        number = 123;
        System.out.println("number " + number);

        int num = 234;
        System.out.println("num " + num);

        number = num;
        System.out.println("number " + number);

        // 변수명 작명(규칙)
        int a;
        int A;

        //예약어
        //int int; 예약어를 변수명으로 사용 X
        //int 2aa; 변수명은 숫자로 시작하면 안됨.
        //int 123; 상수로만 이루어진 변수명은 사용이 안됨.
        //int _adb;
        //int adb-; // 변수명에 연산자는 사용 안됨.

        int number_position_char;
        int numPosChar; //낙타형(Camel) -> 많이 사용
        int numposchar;
        int 마징가;
        마징가 = 2022;
        System.out.println("마징가 " + 마징가);

        int iCharPos;
        iCharPos = 마징가;
        System.out.println("iCharPos " + iCharPos);

        //흔한 변수명은 피하는 것이 좋다.
        //object, length, number, size
    }
}