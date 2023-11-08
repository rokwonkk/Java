package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //example22();
        //example23();
        //example24();
        //example25();
        example26();
    }


    static void example22(){
        System.out.println("과제 22");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[11];
        int maxvalue = 0;   //최대값
        int minvalue = 0; //최소값
        for (int i=0; i < 10; i++){
            System.out.print("1 ~ 100사이의 값을 10개 입력하시오 " + i + "/10 " );
            int value = sc.nextInt();
            arr[i] = value;

            if(maxvalue < arr[i]){
                maxvalue = arr[i];
            } else if(maxvalue >= arr[i]){
                minvalue = arr[i];
            }
        }
        System.out.println("최대값 : " + maxvalue + "\t최소값 : " + minvalue);
        System.out.println();
    }

    static void example23(){
        System.out.println("과제 23");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int avescore = 0; // 평균 점수
        int arr[][] = new int[6][4];
        for (int i=0; i < 5; i++){
            int sum = 0; // 점수 총합
            System.out.println(i +"번 학생");
            for (int j=0; j < 3; j++){

                int value = sc.nextInt();

                if (j == 0) System.out.println("국어점수 : " + value);
                if (j == 1) System.out.println("수학점수 : " + value);
                if (j == 2) System.out.println("영어점수 : " + value);

                arr[i][j] = value;
                sum += arr[i][j];
                avescore = sum / 3;
            }

            System.out.println("점수 총 합 : " + sum);
            System.out.println("점수 평균 : " + avescore);
            if (avescore >= 80 ){
                System.out.println("합격입니다");
            } else if (avescore <= 60)  {
                System.out.println("불합격입니다");
            } else {
                System.out.println("재시험응시자입니다");
            }

        }
    }

    static void example24() {
        System.out.println("과제 24");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해 주십시오 : ");
        String value = sc.next();

        boolean isNumber = value.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumber) {
            System.out.println("모두 숫자입니다.");
        } else {
            System.out.println("모두 숫자가 아닙니다");
        }
    }

    static void example25() {
        System.out.println("과제 25");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("첫 번째 값 입력 >> ");
            int value = sc.nextInt();
            System.out.println("입력하신 정수 1은 : " + value +"입니다.");

            System.out.print("두 번째 값 입력 >> ");
            int value2 = sc.nextInt();
            System.out.println("입력하신 정수 2은 : " + value2 +"입니다.");

            System.out.print("(+, -, *, /) 중 하나를 입력 >> ");
            String operator = sc.next();

            switch (operator) {
                case "+" -> System.out.println(value + " + " + value2 + " = " + (value + value2));
                case "-" -> System.out.println(value + " - " + value2 + " = " + (value - value2));
                case "*" -> System.out.println(value + " * " + value2 + " = " + (value * value2));
                case "/" -> System.out.println(value + " / " + value2 + " = " + (value / value2));
                default -> System.out.println("연산자가 잘못 입력되었습니다. 다시 입력해주십시오.");
            }
        } catch(Exception e){
            System.out.println("잘못입력되었습니다 다시입력하십시오");
            example25();
        }
    }


    static void example26() {

        // 2차원 배열을 1차원 배열에 제어 문을 이용하여 저장하고 출력하라.


    }

}