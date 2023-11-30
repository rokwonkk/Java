package Linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /**
         *
         *  ArrayList : 검색, 대입(배열)
         *
         *
         *  LinkedList : 실시간 추가/삭제에 적합
         *
         */

//        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Giants");
        arrList.add("Tigers");
        arrList.add("Twins");

        LinkedList<String> linkList = new LinkedList<String>(arrList);

        for (String s : linkList) {
            System.out.println(s);
        }

        System.out.println();

        //맨 앞의 Node에 element(object)를 추가
        // 0번제에 하나의 객체를 추가
        linkList.addFirst("Eagles");

        linkList.addLast("Bears");

        for (String s : linkList) {
            System.out.println(s);
        }

        System.out.println();

        /**
         *  iterator : 반복자 == 포인터(주소)
         *
         *  list.get(0 ~ n)
         *
         *  [0] -> [1] -> [2]   index
         *  0x01  0x02   0x03   iterator
         *
         */

        Iterator<String> it = linkList.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}