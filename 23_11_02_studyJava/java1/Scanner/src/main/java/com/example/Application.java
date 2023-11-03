package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; // module or 기능 -> 필요한 기능이나 모듈만 임포트 할 것, 필요없는 것 까지 다 임포트하면 프로그램이 무거워 진다.

public class Application {
    public static void main(String[] args) throws IOException {
        /**
         *  input -> console
         *  출력 -> System.out.println(변수 or 값(value))
         *
         *  입력 -> 변수
         *
         */
        //출력
//        int num = 123;
//        System.out.println(num + " " + 224);

        //입력 -> 입력을 받았을 때 저장해야 할 변수가 필요
        Scanner sc = new Scanner(System.in);

        //boolean
//        boolean b;
//        System.out.println("b = ");
//        b = sc.nextBoolean();   // ture or talse
//        System.out.println("b: " + b);

        //int
//        int age;
//        System.out.println("당신의 나이 = ");
//        age = sc.nextInt();
//        System.out.println("age: " + age);

        //double
//        double height;
//        System.out.println("당신의 키 = ");
//        height = sc.nextDouble();
//        System.out.println("height: " + height);

        //String
//        String name;
//        System.out.println("이름 = ");
//        name = sc.next();
//        System.out.println("name: " + name);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String address;
        System.out.println("주소 = ");
        address = br.readLine();
        System.out.println("address: " + address);

    }
}