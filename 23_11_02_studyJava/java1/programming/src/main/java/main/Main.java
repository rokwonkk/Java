package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  10진수 -> 2진수
         *  2진수 -> 10진수
         *  10진수 -> 16진수
         *  16진수 -> 10진수
         *  2진수 -> 16진수
         *  16진수 -> 2진수
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("다음 중 원하는 변환의 번호를 입력해 주십시오.");

            System.out.println("1. 10진수를 2진수로 변환");
            System.out.println("2. 2진수를 10진수로 변환");
            System.out.println("3. 10진수를 16진수로 변환");
            System.out.println("4. 16진수를 10진수로 변환");
            System.out.println("5. 2진수를 16진수로 변환");
            System.out.println("6. 16진수를 2진수로 변환");

            System.out.print("원하는 변환 번호 >> ");
            int work = sc.nextInt();

            int num10 = 0; //10진수 값
            String num10to2 = ""; //10진수를 2진수로 변환한 값

            String num2 = ""; //2진수 값
            int num2to10 = 0; //2진수를 10진수로 변환한 값
            String num2to16 = "";

            String num16 = ""; //16진수 값
            int num16to10 = 0; //16진수를 10진수로 변환한 값
            String num16to2 = "";

            switch (work){
                case 1:
                    System.out.print("10진수 = ");
                    num10 = sc.nextInt();

                    num10to2 = Integer.toBinaryString(num10);
                    System.out.print("10진수 " + num10 + "은 2진수 " + num10to2 + " 입니다.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("2진수 = ");
                    num2 = sc.next();

                    num2to10 = Integer.parseInt(num2,2);

                    System.out.print("2진수 " + num2 + "은 10진수 " + num2to10 + " 입니다.");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("10진수 = ");
                    num10 = sc.nextInt();

                    num2 = Integer.toHexString(num10);
                    System.out.print("10진수 " + num10 + "은 16진수 " + num2 + " 입니다.");
                    System.out.println();
                    break;
                case 4:
                    System.out.print("16진수 = ");
                    num16 = sc.next();

                    num16to10 = Integer.parseInt(num16,16);

                    System.out.print("16진수 " + num16 + "은 10진수 " + num16to10 + " 입니다.");
                    System.out.println();
                    break;
                case 5:
                    //2진수를 10진수로 바꿔서 10진수를 16진수로 변환하면 되겠다.
                    System.out.print("2진수 = ");
                    num2 = sc.next();

                    //받은 2진수를 10진수로 변환
                    num2to10 = Integer.parseInt(num2,2);

                    //변환한 10진수를 16진수로 변환
                    num2to16 = Integer.toHexString(num2to10);

                    System.out.print("2진수 " + num2 + "은 16진수 " + num2to16 + " 입니다.");
                    break;
                case 6:
                    //16진수를 10진수로 바꿔서 10진수를 16진수로 변환하면 되겠다.
                    System.out.print("16진수 = ");
                    num16 = sc.next();

                    //받은 16진수를 10진수로 변환
                    num16to10 = Integer.parseInt(num16,16);

                    //변환한 10진수를 16진수로 변환
                    num16to2 = Integer.toBinaryString(num16to10);

                    System.out.print("16진수 " + num16 + "은 2진수 " + num16to2 + " 입니다.");
                    break;
            }
        }
    }
}