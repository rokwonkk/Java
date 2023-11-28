package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         *
         *  Collection -> list -> linkedlist arraylist 자주 사용
         *  Map -> hashmap , sortedmap(treemap) 정도를 자주 사용
         *
         *  Collection : 수집
         *
         *  List : 목록
         *          데이터의 관리를 동적으로 할 수 있는 배열.
         *          관리는 (index) number로 접근 및 관리한다.
         *          선형구조 ㅁ-ㅁ-ㅁ-ㅁ-...
         *
         *  ArrayList(거의 대부분 ArrayList) :
         *          검색 효율 우수
         *
         *  LinkedList :
         *          빈번하게 추가/삭제가 되는 경우 효율 우수
         *
         */

        //동적인 배열을 선언
//        ArrayList<Integer> arrList = new ArrayList<Integer>();
//        arrList.add(1);
//        arrList.add(5);
//        arrList.add(3);
//        arrList.add(1);
//        arrList.add(4);
//        arrList.add(1);
//
//        for (Integer i : arrList) {
//            System.out.print(i + " ");
//        }

//        List<Integer> arrList = new ArrayList<Integer>();

        /** ArrayList를 사용해도되고 List를 사용해도 되지만.ArrayList는 클래스, List는 인터페이스 이기 때문에 List를 사용하는게 좋다고 볼 수 있다. **/
        //ArrayList<Integer> arrList = new ArrayList<Integer>();
        //List<Integer> arrList = new ArrayList<Integer>();

        /**
         *  동적인 배열을 선언! ArrayList arrList[] = new ArrayList[];
         */
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        List<Integer> list = new ArrayList<Integer>();

        //추가
        list.add(1111);

        //정석
        Integer in = new Integer(2222);
        list.add(in);

        list.add(new Integer(3333));

        //목록의 크기
        int len = list.size(); // length와 동일
        System.out.println("size : " + len);

        //목록에서 데이터 산출
        Integer ii = list.get(0);
        System.out.println("ii : " + ii);

        //모든 데이터를 출력
        for(int i = 0; i < list.size(); i++){
            Integer find = list.get(i);
            System.out.println(i +" : " + find);
        }

        for (Integer i : list) {
            System.out.println("forEach : " + i);
        }

        //원하는 위치에 추가 0 ~ 2 -> 1111 2222 3333 <- 3000 ( 2222 요기 3333)
        Integer inum = 3000;
        list.add(2, inum);

        for (Integer i : list) {
            System.out.println("forEach2 : " + i);
        }

        //삭제
        list.remove(1); // 번지수로 날리는걸 더 많이 사용한다.
//        list.remove(new Integer(3000)); // 고정으로 날리는건 잘 안사용하지.
        for(int i = 0; i < list.size(); i++){
            Integer find2 = list.get(i);
            System.out.println(i +" : " + find2);
        }

        //검색
        int index = list.indexOf( 3000 );
        System.out.println("index : " + index);
        System.out.println("find index : " + list.get(index));

        int findData = 0;
        for (int i = 0 ; i < list.size(); i++){
            Integer n = list.get(i);
            if(n == 3333){
                findData = i;
                break;
            }
        }
        System.out.println("findData : " + findData);

        //수정
        Integer newInt = 5555;
        list.set(1, newInt);

        for(int i = 0; i < list.size(); i++){
            Integer find3 = list.get(i);
            System.out.println(i +" : " + find3);
        }
    }
}