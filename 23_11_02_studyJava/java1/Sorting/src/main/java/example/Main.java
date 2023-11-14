package example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *  Sorting : 정렬
         *              숫자의 크기에 따라서 순번대로 배치하는 처리.
         *              오름차순(큰값이 뒤로), 내림차순(작은값 뒤로)
         *              입사순위                연봉순위
         *
         *              선택, 버블, 합병, 퀵
         */

        //sorTing();
        //sorTing2();
        sorTing3();

        //스왑
        //swap();
    }

    static void sorTing() {
        int number[] = { 2, 5, 1 , 3, 4};
        int temp; //swap용 변수

        for (int i = 0; i < number.length - 1; i++){

            for (int j= i+1; j < number.length; j++){

                if (number[i] > number[j]){
                    //오름차순 1, 2, 3, 4, 5 작은 숫자가 앞으로
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i] + " ");
//        }

        //1차원 배열만 가능 2차원 배열은 돌려줘야함
        System.out.println(Arrays.toString(number));
    }

    static void sorTing2() {

        /** 배열끼리 바꿔서  **/

        int myArray[] = {1, 2, 3, 4, 5};
        int youArray[] = {3, 6, 9, 12, 15};
        int temp;

        for (int i=0; i < myArray.length; i++){
            for (int j=0; j < youArray.length; j++){
                if (i == j){
                    temp = myArray[i];
                    myArray[i] = youArray[j];
                    youArray[j] = temp;
                }
            }
        }

        System.out.print("myArray : ");
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.print("youArray : ");
        for (int i = 0; i < youArray.length; i++){
            System.out.print(youArray[i] + " ");
        }

    }

    private static void sorTing3() {

        /*  Sorting */

        //선언부

        Scanner sc = new Scanner(System.in);
        int sortNumber[] = null;
        int sort = 0;

        /**
         *  입력
         *      몇개 정렬?
         *      숫자 입력
         *      오름 / 내림
         */
        System.out.print("몇개를 정렬 하시겠습니까? >> ");
        int count = sc.nextInt();

        sortNumber = new int[count];

        int countSortNum = 1; // 입력 숫자 확인용
        for (int i=0; i < sortNumber.length; i++){
            System.out.print("숫자를 입력하십시오 ( " + countSortNum + " / " + sortNumber.length + "개 )" + " >> " );
            sortNumber[i] = sc.nextInt();
            countSortNum++;
        }

        System.out.println("오름차순(1) / 내림차순(2) ");
        while (true) {
            int valid;
            valid = sc.nextInt();

            if (valid == 1 || valid == 2){
                sort = valid;
                break;
            } else {
                System.out.print("1 또는 2만 입력가능합니다. 오름차순(1) / 내림차순(2) ");
                valid = sc.nextInt();
            }
        }

        /**
         *  처리
         *      오름 / 내림
         */
        int temp;
        switch (sort){
            case 1:
                System.out.println("오름차순 정렬입니다.");
                for (int i = 0; i < sortNumber.length - 1; i++){
                    for (int j= i+1; j < sortNumber.length; j++){
                        if (sortNumber[i] > sortNumber[j]){
                            //오름차순 1, 2, 3, 4, 5 작은 숫자가 앞으로
                            temp = sortNumber[i];
                            sortNumber[i] = sortNumber[j];
                            sortNumber[j] = temp;
                        }
                    }
                }
                break;
            case 2:
                System.out.println("내림차순 정렬입니다.");
                for (int i = 0; i < sortNumber.length - 1; i++){
                    for (int j= i+1; j < sortNumber.length; j++){
                        if (sortNumber[i] < sortNumber[j]){
                            //내림차순 5, 4, 3, 2, 1 큰숫자가 앞으로
                            temp = sortNumber[i];
                            sortNumber[i] = sortNumber[j];
                            sortNumber[j] = temp;
                        }
                    }
                }
                break;
        }

        //결과 출력
        for (int i=0; i < sortNumber.length; i++){
            System.out.print(sortNumber[i] + " ");
        }
    }

    /**
     *  정렬은 아니지만 배열의 값을 전부 바꾸게 될 때 사용
     */
    private static void swap() {

        int myArray[] = {1, 2, 3, 4, 5};
        int youArray[] = {3, 6, 9, 12, 15};

        int mArr[] = myArray;
        int yArr[] = youArray;

        System.out.println(Arrays.toString(mArr));
        System.out.println(Arrays.toString(yArr));

        int temp[] = mArr;
        mArr = yArr;
        yArr = temp;

        System.out.println(Arrays.toString(mArr));
        System.out.println(Arrays.toString(yArr));
    }
}