package main;

public class Main {
    public static void main(String[] args) {
        /**
         *  continue : skip(생략)
         *              루프문 안의 처리를 생략
         *              단독 사용 불가
         *              loop문과 같이 사용
         *              for, while
         *
         *  for(초기화;조건;연산){
         *      처리1
         *      처리2
         *
         *      if(i == 4){
         *          continue;
         *      }
         *
         *      처리3
         *      처리4
         *  }
         */

        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
            System.out.println("\t처리 1");
            System.out.println("\t처리 2");

            if (i > 2) continue;
            // skip
            System.out.println("\t처리 3");
            System.out.println("\t처리 4");
        }
    }
}