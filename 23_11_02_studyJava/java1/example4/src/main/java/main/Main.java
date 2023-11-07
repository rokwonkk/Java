package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte num1, num2;

        num1 = 127;
        num2 = 56;

        //16진수로 바꾼다

        num1 = (byte)((num1 & num2) | (num1 & num2));
        num2 = (byte)~(num1 ^ num2);

        //16진수로 출력하라
        System.out.println(num1);
        System.out.println(num2);

        System.out.println();
        System.out.println("과제 10 ");
        System.out.println();

        System.out.print("하나의 수를 입력 하시오 = ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        System.out.println((value > 0) ? "양수입니다" : "음수입니다");
        System.out.println();

        System.out.println();
        System.out.println("과제 11 ");
        System.out.println();

        int random1 = (int)(Math.random() * 100);
        System.out.println("0 ~ 99 중 1개의 값 : " +random1);

        int random2 = (int)(Math.random() * 5) + 11;
        System.out.println("11,12,13,14,15 중 1개의 값 : " +random2);

        System.out.print("1 ~ 45 중 6개 뽑기 : ");
        int arrayRandom[] = {
                (int)(Math.random() * 45)+1,
                (int)(Math.random() * 45)+1,
                (int)(Math.random() * 45)+1,
                (int)(Math.random() * 45)+1,
                (int)(Math.random() * 45)+1,
                (int)(Math.random() * 45)+1 };
        for (int i : arrayRandom) {
            System.out.print(" "+i);
        }
    }
}