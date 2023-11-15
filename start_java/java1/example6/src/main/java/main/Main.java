package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("과제 19");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("영문자를 입력하세요 = ");
        String str = sc.next();

        char c = str.charAt(0);

        //대소문자 판정
        int char_num = (int) c;
        //System.out.println("char_num : " + char_num);

        int upper = 0;
        if ( char_num >= 65 && char_num <= 90) {
            upper = 1;
        } else if( char_num >= 97 && char_num <= 122 ) {
            upper = 2;
        } else {
            upper = 3;
            System.out.println("영문자가 아닙니다.");
        }

        switch (upper){
            case 1 : // 대문자 -> 소문자
                char_num = char_num + 32;
                System.out.println("char_num : " + (char)char_num);
                break;
            case 2 : // 소문자 -> 대문자
                char_num = char_num - 32;
                System.out.println("char_num : " + (char)char_num);
                break;
            default:
                System.out.println("영문자가 아닙니다.");
        }

        System.out.println();
        System.out.println("과제 20");
        System.out.println();

        int sum = 0;
        for (int i = 0; i < 20; i++){
            if (  i % 2 != 0 &&  i % 3 != 0){
                sum = sum + i;
                //System.out.println("i : " + i);
                //System.out.println("sum : " + sum);
            }
        }
        System.out.println(sum);

        //과제 20 다른방법 - continue 사용
        int sum1 = 0;
        for(int i = 1; i<=20; i++){
            if (i % 2 == 0 || i % 3 == 0){
                continue;
            }
            sum1 += i;
        }
        System.out.println(sum1);


        System.out.println();
        System.out.println("과제 21");
        System.out.println();

        long sum2 = 1;
        long first = 1;
        long second = 1;
        long arr[] = new long[21];

        int count=1;
        for (int i = 0; i < 19; i++){

            arr[i] = first;
            arr[i+1] = second;

            sum2 = first + second;
            arr[i + 2] = sum2;

            first = second;
            second = sum2;

            count++;
        }
        System.out.println(arr[20]);
    }
}