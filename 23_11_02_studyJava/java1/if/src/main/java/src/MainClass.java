package src;

import com.sun.source.tree.IfTree;

public class MainClass {
    public static void main(String[] args) {
        /**
         *  조건문
         *  논리연산자 : && || !
         *  부등호 : >, <, >=, <=, ==, !==
         */

        /**  형식 :
         *              if( 조건(참/거짓) ){
         *                  처리
         *              }
         */


        int number = 2;
        if(number == 1){
            System.out.println("넘버는 1이 맞습니다");
        } else {
            System.out.println("넘버는 1이 아닙니다");
        }

        if( number > 0 && number < 10){
            System.out.println("넘버는 0초과 그리고 10미만이 맞습니다");
        }

        if(number < 5 || number > 10){
            System.out.println("넘버는 5미만 이거나 10초과이다");
        }

        if ( true ){
            System.out.println("무조건 실행!");
        }

        boolean b = true;
        if (b == true){
            System.out.println("참이 맞습니다");
        }
        if ( b ){
            System.out.println("b는 참이 맞습니다");
        }
        b = false;
        if (b == false){
            System.out.println("참이 아닙니다 or 거짓 입니다.");
        }
        if (!b){
            System.out.println("참이 아닙니다 or 거짓 입니다.");
        }

        String str = "hello";
        String msg = "hell";

        msg = msg + "o";

//        if(str == msg){
//            System.out.println("같은 문자열 입니다");
//        } else {
//            System.out.println("다른 문자열 입니다");
//        }
        boolean b1 = str.equals(msg);
        if(b1 == true){
            System.out.println("같은 문자열 입니다");
        }

        if (str.length() == 5){
            System.out.println("str은 5개의 문자입니다.");
        }

        //str이 빈문자열이 아닐 경우
        if(str != null){
            System.out.println("1 str은 빈 문자열이 아닙니다");
        }
        if(str.length() != 0){
            System.out.println("2 str은 빈 문자열이 아닙니다");
        }
        if ( !str.equals("")){
            System.out.println("3 str은 빈 문자열이 아닙니다.");
        }

        /**  형식 :
         *              if( 조건(참/거짓) ){
         *                  처리1
         *              } else {
         *                  처리2
         *              }
         */

        number = 5;
        if(number > 0){
            System.out.println("넘버는 5보다 크다");
        } else {
            System.out.println("넘버는 5보다 작거나 같다");
        }

        String s = (number > 5) ? "넘버는 5보다 크다" : "넘버는 5보다 작거나 같다";
        System.out.println("s : " + s);

        System.out.println((number > 5) ? "넘버는 5보다 크다" : "넘버는 5보다 작거나 같다");

        number = 86;

        if (number == 100){
            System.out.println("A+");
        } else if(number >= 90) {
            System.out.println("A");
        } else if(number >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C 또는 D");
        }

        //다중 조건문
        if (number >= 85 && number < 90){
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }

        if ( number >= 80 && number < 90 ){
            if(number >= 85){
                System.out.println("합격입니다");
            } else {
                System.out.println("불합격입니다");
            }
        }
    }
}