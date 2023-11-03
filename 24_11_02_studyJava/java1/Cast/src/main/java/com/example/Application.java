package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {

        /**
         *  (자료)형 변환        우선순위
         *
         *  byte    1               낮음
         *  short   2
         *  int     4
         *  long    8
         *
         *  float   4
         *  double  8               높음
         *
         *  auto(자동), cast(강제) 변환
         *  컵에 비유를 하자면 작은 컵에서 큰 컵으로 바꿀때는 자동을 사용하며
         *  큰 컵에서 작은 컵으로 바꿀때는 강제로 변환 시켜 준다.
         */

        //자동 형 변환 -> 작은 컵에 물을 큰 컵에 따라도 넘치지 않는다.
        short sh = 10000;
        int num;

        num = sh;
        System.out.println(num);

        // 강제(cast) 형 변환 -> 큰 컵에 있는 물을 작은 컵에 따르면 넘쳐서 문제가 생긴다.
        num = 12345;
        sh = (short) num;
        System.out.println(sh);

        double result;

        result = (double) 3 / 2;
        System.out.println(result);

        long l = 123456789L;
        float f = l;
        System.out.println(f);

        double d = l;
        System.out.println(d);

        /**
         *  1.23456789E8 -> 9다음의 E8은 = ( *10의 8승 )
         *
         */

        double value = 1250.45;
        int money = (int) value;
        System.out.println(money);

    }
}