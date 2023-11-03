package com.example;

public class MainClass {
    public static void main(String[] args) {

        //변수의 자료형(그릇)의 종류

        /**
         * 정수형
         */
        //정수
        byte by;    //1 byte == 8 bit -> 256개
        by = -128;
        System.out.println(by); // 127 ~ -128

        short sh;   //2 byte
        sh = 12345;
        System.out.println(sh);

        int i;      //4 byte
        i = 123456789;
        System.out.println(i);

        long lo;
        lo = 1234567890112415123L;
        System.out.println(lo);

        //소수
        float f;
        f = 123.456789f;
        System.out.println(f);

        double d;
        d = 123.415123462113;
        System.out.println(d);

        /**
         * 문자형
         */
        //문자
        char c;     //2 byte character <- uni-code ASCII code
        c = 'a';
        c = '한';
        c = '+';
        c = 'A';
        System.out.println("c " + c);

        //문자열
        //String == wrapper class
        String str;
        str = "hello";
        System.out.println("str " + str);

        str = "world";
        System.out.println("str " + str);

        //논리형 논리형(참/거짓) true(1) / false(0)
        boolean b;
        b = true;
        System.out.println("b " + b);

        b = false;
        System.out.println("b " + b);
    }
}