package src;

public class MainClass {
    public static void main(String[] args) {

        /**
         *  switch  :
         *      조건문에 해당된다
         *      값이 명확해야 한다 ( 범위 지정 X )
         *      소수값 사용 불가
         *
         *      조건문보다 명확할때는
         *      코드가 깔끔하기도하고 속도측면에서도 조금 낫다
         *      적절한 트레이드 오프가 필요
         */

        /**
         *  형식 :
         *          switch ( 변수 ) {
         *              case 값1 :       변수 == 값1
         *                  처리1
         *                  break;
         *
         *              case 값2 :       변수 == 값2
         *                  처리2
         *                  break;
         *
         *              case 값n :       변수 == 값n
         *                  처리n
         *                  break;
         *
         *              default :
         *                  case문에 아무것도 처리가 되지 않았을 때
         *                  break;
         *          }
         */

        int number = 4;

        switch (number){
            //if(number == 1)
            case 1:
                System.out.println("넘버는 1입니다.");
                break;
            //if(number == 2)
            case 2:
                System.out.println("넘버는 2입니다.");
                break;
            //if(number == 3)
            case 3:
                System.out.println("넘버는 3입니다.");
                break;
            default:
                System.out.println("default 입니다.");
                break;
        }

        // <, >, <=, >=, ! 사용 안된다.
//        char c = '가';
//        switch ( c ){
//            case '가'> c :
//                break;
//            case !'가' :
//                break;
//        }
        // 소수 값이 안됨
//        double d = 123.1;
//        switch ( d ){
//            case 123.1:
//                break;
//        }

        String str = "ABC";
        switch (str){
            case "ABC" :
                System.out.println("str은 : " + str + " 입니다");
                break;
        }
    }
}