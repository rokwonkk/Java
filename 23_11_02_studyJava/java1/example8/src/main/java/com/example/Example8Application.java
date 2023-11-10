package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Example8Application {
    public static void main(String[] args) {
        //example31();
        //example31_1();
        //example32_X();
        //example32_1();
    }
    private static void example31() {
        Scanner sc = new Scanner(System.in);

        Boolean isyn = true;
        int countwin = 0;
        int countlos = 0;
        do {
            //컴퓨터가 낸거
            int com = (int) (Math.random()*3);

            //자신이 낸거 입력
            System.out.print("가위(0), 바위(1), 보(2) 를 입력해 주십시오 >>> ");
            int my_num = sc.nextInt();

            switch (com){
                case 0:
                    System.out.println("컴퓨터는 가위를 냈습니다.");
                    break;
                case 1:
                    System.out.println("컴퓨터는 바위를 냈습니다.");
                    break;
                case 2:
                    System.out.println("컴퓨터는 보를 냈습니다.");
                    break;
            }

            switch (my_num){
                case 0:
                    System.out.println("당신은 가위를 냈습니다.");
                    if (com == 0) {
                        System.out.println("당신은 비겼습니다.");
                    }
                    if (com == 1) {
                        System.out.println("당신은 졌습니다.");
                        countlos++;
                    }
                    if (com == 2) {
                        System.out.println("당신이 이겼습니다.");
                        countwin++;
                    }
                    break;
                case 1:
                    System.out.println("당신은 바위를 냈습니다.");
                    if (com == 1) System.out.println("당신은 비겼습니다.");
                    if (com == 2) {
                        System.out.println("당신은 졌습니다.");
                        countlos++;
                    }
                    if(com == 0) {
                        System.out.println("당신이 이겼습니다.");
                        countwin++;
                    }
                    break;
                case 2:
                    System.out.println("당신은 보를 냈습니다.");
                    if (com == 2) System.out.println("당신은 비겼습니다.");
                    if (com == 0) {
                        System.out.println("당신은 졌습니다.");
                        countlos++;
                    }
                    if(com == 1) {
                        System.out.println("당신이 이겼습니다.");
                        countwin++;
                    }
                    break;
            }

            System.out.println(countwin+"승 "+countlos+"패");

            System.out.println();
            System.out.print("다시 하시겠습니까? (y/n) ");

            String inputyn = sc.next();
            if (inputyn.equals("n")||inputyn.equals("N")){
                isyn = false;
                System.out.println("안녕히 가세요 ~");
            }
        } while (isyn);
    }
    private static void example31_1() {
        /**
         *  가위,바위, 보 게임을 작성
         *  user : com(Ramdom)
         */
        /**  (변수) 선언부 */

        Scanner sc = new Scanner(System.in);

        int userNum, comNum;
        int result;
        int win, lose, draw;

        //초기화(initialize)
        win = lose = draw = 0;

        System.out.println("---<< 가위 바위 보 게임 >>---");

        while(true) {

            /** random */
            comNum = (int) (Math.random() * 3);
            System.out.println("com : " + comNum);

            /** user input */
            System.out.print("가위(0), 바위(1), 보(2) = ");
            userNum = sc.nextInt();

            /** 판정처리 **/
            /**
             //user 승
             if(userNum == 0 && comNum == 2) result = 1;
             else if(userNum == 1 && comNum == 0) result = 1;
             else if(userNum == 2 && comNum == 1) result = 1;

             //user 패
             if(userNum == 2 && comNum == 0) result = 0;
             else if(userNum == 0 && comNum == 1) result = 0;
             else if(userNum == 1 && comNum == 2) result = 0;

             //무승부
             if(userNum == 0 && comNum == 0) result = 2;
             else if(userNum == 1 && comNum == 1) result = 2;
             else if(userNum == 2 && comNum == 2) result = 2;
             */

            /** 가위바위보 공식을 넣은 판정처리
             *
             *  com     user    win
             *  2 -     0   + 2 = 4 % 3 = 1
             *  0 -     1   + 2 = 1 % 3 = 1
             *  1 -     2   + 2 = 1 % 3 = 1
             *
             *                  lose
             *  0 -     2   + 2 = 0 % 3 = 0
             *  1 -     0   + 2 = 3 % 3 = 0
             *  2 -     1   + 2 = 3 % 3 = 0
             *
             *                  draw
             *  0 -     0   + 2 = 2 % 3 = 2
             *  1 -     1   + 2 = 2 % 3 = 2
             *  2 -     2   + 2 = 2 % 3 = 2
             *
             */

            result = (comNum - userNum + 2) % 3;

            /** 결과출력 **/
            String message = "";
            switch (result) {
                case 1:
                    message = "당신의 승리입니다.";
                    win++;
                    break;
                case 0:
                    message = "당신의 패배입니다.";
                    lose++;
                    break;
                case 2:
                    message = "무승부 입니다.";
                    draw++;
                    break;
            }

            System.out.println(message);
            System.out.println("전적은 " + win + "승 " + lose + "패 " + draw + "무 입니다");

            /**
             *  다시시작
             */
            System.out.println("play again?(y/n) = ");
            String answer = sc.next();

            if (answer.equals("N")||answer.equals("n")){
                System.out.println("안녕히 가십시오");
                break;
            }

            System.out.println("게임을 다시 시작합니다. 파이팅!");
        }
    }

    //망함.. 다음에 다시 짜봐야겠다.
    private static void example32_X() {

        int student;
        Scanner sc = new Scanner(System.in);

        System.out.print("총 학생 수 입력 : ");
        student = sc.nextInt();

        String[][] arr2 = new String[student][4];
        int total[] = new int[arr2.length];

        for(int i = 0; i < student; i++) {

            int sum = 0;
            double avg = 0;

            for(int j = 1; j < arr2.length; j++) {

                System.out.print("이름을 입력하세요 >> ");
                arr2[i][0] = sc.next();

                System.out.print(arr2[i][0] + "학생 국어 점수 입력 >> ");
                arr2[i][j] = String.valueOf(sc.nextInt());
                sum += Integer.parseInt(arr2[i][j]);

                System.out.print(arr2[i][0] + "학생 영어 점수 입력 >> ");
                arr2[i][j+1] = String.valueOf(sc.nextInt());
                sum += Integer.parseInt(arr2[i][j+1]);

                System.out.print(arr2[i][0] + "학생 수학 점수 입력 >> ");
                arr2[i][j+2] = String.valueOf(sc.nextInt());
                sum += Integer.parseInt(arr2[i][j+2]);

                System.out.println(arr2[i][0] + "학생의 총점은 "+sum+"입니다.");

                total[i] = total[i] + Integer.parseInt(arr2[i][j]);

                avg = (double) sum / 3;
                System.out.println(arr2[i][0] + "학생의 평균은 "+avg+"입니다.");

            }
        }

        /** 총점 출력 **/
        int max = total[0];
        for(int i = 0; i < student; i++) {
                if (max < total[i]){
                    max = total[i];
                }
            System.out.println(total[i] + " ");
        }
    }
    private static void example32_1() {

        /** 선언 */
        Scanner sc = new Scanner(System.in);
        String student[][] = null;

        /** 총 학생 수 입력 */
        System.out.print("학생의 총원 = ");
        int count = sc.nextInt();

        /** 배열을 학생 수에 맞게 생성 */
        student = new String[count][4];

        /** 학생들의 이름과 점수를 입력 */
        for (int i=0; i < student.length; i++){

            System.out.print("학생이름 = ");
            student[i][0] = sc.next();

            System.out.print("국어 = ");
            student[i][1] = sc.next();

            System.out.print("영어 = ");
            student[i][2] = sc.next();

            System.out.print("수학 = ");
            student[i][3] = sc.next();
        }

        for (int i=0; i<student.length; i++){
            for (int j=0; j< student[i].length; j++){
                System.out.print(student[i][j] + " ");
            }
            System.out.println();
        }

        /** 총점을 계산 그리고 배열에 대입 */
        int total[] = new int[student.length];
        for (int i=0; i < student.length; i++){
            for (int j=1; j < student[i].length; j++){
                total[i] = total[i] + Integer.parseInt(student[i][j]);
            }
        }

        /** 총점 출력 */
        for (int i=0; i < student.length; i++){
            System.out.println(student[i][0] + " : " + total[i]);
        }

        /** 평균 출력 */
        for (int i=0; i < student.length; i++){
            System.out.println(student[i][0] + " : " + ((double)total[i]) / 3);
        }

        /** 최고점수를 받은 학생이름과 점수를 출력 */
        int max = total[0];
        for (int i =0; i < total.length; i++){
            if(max < total[i]){
                max = total[i];
            }
        }

        int numberOne=0;
        for (int i = 0; i < total.length; i++){
            if (max == total[i]){
                numberOne = i;
                break;
            }
        }

        System.out.println("현재 클래스의 일등은 " + student[numberOne][0] + "님이며 총점은" + total[numberOne]+ "입니다.");

        /** 최하점수를 받은 학생이름과 점수를 출력 */
        int min = total[0];
        for (int i =0; i < total.length; i++){
            if(min > total[i]){
                min = total[i];
            }
        }

        int numberWorst=0;
        for (int i = 0; i < total.length; i++){
            if (min == total[i]){
                numberWorst = i;
                break;
            }
        }

        System.out.println("현재 클래스의 꼴등은 " + student[numberWorst][0] + "님이며 총점은" + total[numberWorst]+ "입니다.");
    }
}