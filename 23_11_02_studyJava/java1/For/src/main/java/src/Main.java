package src;

public class Main {
    public static void main(String[] args) {

        /**
         *  for : loop문 , 순환문, 반복문
         *        지정된 횟수 만큼 반복하는 제어문
         *
         *  형식 :
         *          for( 초기화 ; 조건 ( 참 / 거짓 ) ; 연산식 ) {
         *              처리
         *          }
         *
         *
         *          for( 초기화(1); 조건(참/거짓)(2)(5)(8); 연산식(4)(7)(10) ) {
         *                  처리(3)(6)(9)
         *          }
         *
         *
         */

        int n;
        for(n = 1; n <= 100; n++){
            System.out.println("n : " + n);
        }

        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }

        int count = 0;
        for ( ; count < 10; ){
            System.out.println("count = " + count);
            count++;
        }

        // endless loop (무한 루프)
//        for(int i = 0; ; i++){
//            System.out.println("i = " + i);
//        }

        for (int i = 0, j = 0; i < 10; i++, j=j+2){
            System.out.println("i = " + i + " j = " + j);
        }

        // 1 ~ 10까지 합계를 구하라
        int sum = 0;
        for(int i =1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("sum : " + sum);

        //카운트합계
        int countSum = 0;
        count = 1;
        for (int i = 0; i < 10; i++){
            countSum = countSum + count;
            count++;
        }
        System.out.println("countSum : " + countSum);

        //다중 for문
        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++){
                System.out.println("\tj = " + j);
            }
        }
    }
}