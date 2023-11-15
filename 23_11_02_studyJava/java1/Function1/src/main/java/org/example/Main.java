package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         *  function : 함수
         *             처리자(processor)
         *  목적 :
         *      코드를 간략화
         *      재사용
         *      처리 분산
         *
         *  형식 :               - 매개변수(parameter), 인수, 인자 -
         *      자로형 함수명( 자료형 가상인수, 자료형 가상인수, ... ){
         *
         *          처리(함수 안)
         *
         *          return 값; <- 자료형
         *      }
         *
         *      return 값이 없는 경우 : void
         *      int, float, double, String
         *
         */

//        function();

//        functionOne(123); // 123 == 실(제) 인수 argument

//        functionTwo(10,20,"홍길동");

//        double dl = functionThree();
//        System.out.println("functionThree 에서 return 값으로 받은 값 : " + dl);

//        int re = functionFour('A');
//        System.out.println("functionFour 에서 받은 return 값 " + re);

//        int array[] = {1, 2, 3};
//        int arr[] = functionFive(array);
//        System.out.println(Arrays.toString(arr));

        //value 의 의한 할당
//        int number = 1;
//        functionValue(number);
//        System.out.println("number = " + number);

        //address 의 의한 할당
        int numarr[] = { 1 };
        functionAddress(numarr);
        System.out.println("numarr[0] = " + numarr[0]);

//        char arrChar[] = {'h', 'e', 'l', 'l', 'o'};
//        UpperChar(arrChar);
//        System.out.println(Arrays.toString(arrChar));

    }

    /* 들어오는 값도 없고 나가는 값도 없음 */
    static void function(){
        System.out.println("function() 호출");
    }

    /* 들어오는 값만 있음 */
    static void functionOne(int n){ // n 가(상) 인수 == parameter 값
        System.out.println("functionOne(int n) 호출");
        System.out.println("외부에서 매개변수를 통해서 전달된 값 : " + n);
    }

    /* 들어오는 값만 있고 그 값이 여러개 일 경우 */
    static void functionTwo(int n, double x, String name){
        System.out.println("functionTwo (int n, double x, String name) 호출");
        System.out.println("n : " + n);
        System.out.println("x : " + x);
        System.out.println("name : " + name);
    }

    /* 나가는 값만 있음 */
    static double functionThree(){
        System.out.println("functionThree() 호출");
        return 234.512;
    }

    /* 들어오는 값이 있고, 나가는 값도 있음 */
    static int functionFour(char c) {
        System.out.println("functionFour(char c) 호출");
        System.out.println("c : " + c);
        return 333;
    }

    /* 들어오는 값이 배열임 */
    static int[] functionFive(int arr[]){
        System.out.println("functionFive(int arr[]) 호출");

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    static void functionValue(int num){
        System.out.println("functionValue(int num) 호출");
        num = 2;
        System.out.println("함수 안 num = " + num);
    }
    static void functionAddress(int num[]){
        System.out.println("functionAddress(int num[]) 호출");
        num[0] = 2;
        System.out.println("함수 안 numarr = " + num[0]);
    }

    static void UpperChar(char arrChar[]){
        for(int i = 0; i < arrChar.length; i++){
            int ascCode = (int) arrChar[i];
            ascCode = ascCode - 32;
            arrChar[i] = (char) ascCode;
        }
    }
}