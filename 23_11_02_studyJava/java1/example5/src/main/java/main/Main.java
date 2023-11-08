package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("과제 12");
        System.out.println();

        int sum = 0;
        for(int i=1; i <= 1000; i++){
            System.out.println("i = " + i);
            sum = sum + i;
            System.out.println("sum = " +sum);
        }

        System.out.println();
        System.out.println("과제 13");
        System.out.println();

        int evensum = 0; // 짝수 합
        int oddsum = 0; // 홀수 합
        for(int i=1; i <= 100; i++){
            if (i % 2 == 0){
                evensum = evensum + i;
            } else {
                oddsum = oddsum + i;
            }
        }
        System.out.println("1부터 100 사이의 짝수의 합은 = " + evensum + " 홀수의 합은 = " + oddsum);

        System.out.println();
        System.out.println("과제 14");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 수를 입력하시오 = ");
        int value = sc.nextInt();


        // 1. 간소화
        int n = 0;
        for (int i = 0; i < 10; i++){
            n = 10 * i;
            if (value > n && value <= (n + 10) ){
                System.out.println("입력한 수는 "+ n +"보다 크거나 같고 "+ (n + 10) +" 보다 작거나 같다");
            }

        }

        // 2. 하드코딩
//        if (value > 0 && value <= 10 ){
//            System.out.println("입력한 수는 0보다 크거나 같고 10 보다 작거나 같다");
//        } else if (value > 10 && value <= 20){
//            System.out.println("입력한 수는 10보다 크거나 20 보다 작거나 같다");
//        } else if (value > 20 && value <= 30){
//            System.out.println("입력한 수는 20보다 크거나 30 보다 작거나 같다");
//        } else if (value > 30 && value <= 40){
//            System.out.println("입력한 수는 30보다 크거나 40 보다 작거나 같다");
//        } else if (value > 40 && value <= 50){
//            System.out.println("입력한 수는 40보다 크거나 50 보다 작거나 같다");
//        } else if (value > 50 && value <= 60){
//            System.out.println("입력한 수는 50보다 크거나 60 보다 작거나 같다");
//        } else if (value > 60 && value <= 70){
//            System.out.println("입력한 수는 60보다 크거나 70 보다 작거나 같다");
//        } else if (value > 70 && value <= 80){
//            System.out.println("입력한 수는 70보다 크거나 80 보다 작거나 같다");
//        } else if (value > 80 && value <= 90){
//            System.out.println("입력한 수는 80보다 크거나 90 보다 작거나 같다");
//        } else if (value > 90 && value <= 100){
//            System.out.println("입력한 수는 90보다 크거나 100 보다 작거나 같다");
//        }

        System.out.println();
        System.out.println("과제 15");
        System.out.println();

        //Scanner sc = new Scanner(System.in);
        int number;
        int mulnumber;
        System.out.print("1 ~ 9 사이의 수 하나를 입력해 주십시오 = ");
        number = sc.nextInt();

        for(int i=1;i < 10; i++){
            if (number == i){
                for(int j=1;j < 10; j++){
                    mulnumber = i * j;
                    System.out.println(i + "*" + j + "=" + mulnumber);
                }
            }
        }

        System.out.println("과제 16");
        System.out.println();
        int mulnum;
        for(int i=1;i < 10; i++){
            for(int j=1;j < 10; j++){
                mulnum = i * j;
                System.out.print(i + "*" + j + "=" + mulnum + " ");
                if (j == 9) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("과제 17");
        System.out.println();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("과제 18");
        System.out.println();

        //방법 1 - 2중 for문 두개
//        for (int i = 0; i < 6; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 4; i++){
//            for (int j = 4; j > i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //방법 2 - 길이 변수 추가

        int len = 0;
        for (int i = 0; i < 9; i++){

            if(i < 5) len++;
            else      len--;

            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}