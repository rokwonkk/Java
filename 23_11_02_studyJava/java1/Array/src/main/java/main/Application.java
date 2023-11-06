package main;

public class Application {
    public static void main(String[] args) {

        /**
         *  Array : 배열
         *          같은 자료형의 변수들의 묶음
         *          변수의 확장기능
         *          관리를 용이하게 하기 위한 목적
         *          번호(index)로 접근 및 관리
         *
         *          int num1,num2,num3,num4 ....
         *
         *          형식 :
         *                  자료형 (배열)변수명[] = new 자료형[배열의 갯수];
         *                                          동적할당 <> 정적
         *                  변수명[0 ~ (배열의 갯수 -1)]
         */
        int num1, num2, num3, num4, num5;
        num1 = 1;
        num2 = 2;
        num3 = 3;
        num4 = 4;
        num5 = 5;

//        다 사용가능
//        int arrNum[] = new int[5];
//        int []arrNum = new int[5];
//        int[] arrNum = new int[5];

        int arrNum[] = null;
        arrNum = new int[5];

        arrNum[0] = 1;  //0:index number 0번지
        arrNum[1] = 2;
        arrNum[2] = 3;
        arrNum[3] = 4;
        arrNum[4] = 5;

        int num11 = 0, num22 = 1, num33 = 2, num44 = 3, num55 = 4;

        //배열의 초기화
        int numArr[] = {0, 1, 2, 3, 4};
        System.out.println(numArr[3]);

        //배열의 길이
        System.out.println("numArr : " + numArr.length);

        //배열 복제, 배열 별명(alias)
        int aNum[] = numArr;
        System.out.println(aNum[0]);
        System.out.println(aNum[1]);
        System.out.println(aNum[2]);
        System.out.println(aNum[3]);
        System.out.println(aNum[4]);

        aNum[3] = 33;
        System.out.println(numArr[3]);

        System.out.println(numArr);
        System.out.println(aNum);
    }
}