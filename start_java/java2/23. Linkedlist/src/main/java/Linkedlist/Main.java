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

        ArrayList<String> list = new ArrayList<String>();
        list.add("데리버거");
        list.add("불고기버거");
        list.add("새우버거");



        LinkedList<String> linkList = new LinkedList<String>(list);

//        for (String s : linkList) {
//            System.out.println(s);
//        }

        System.out.println();

        //맨 앞의 Node에 element(object)를 추가

        // 0번제에 하나의 객체를 추가
        linkList.addFirst("햄버거");

        linkList.addLast("스페셜 햄버거");

        System.out.println("linkList.get(0) : " + linkList.get(0));
        System.out.println("linkList.get(1) : " + linkList.get(1));
        System.out.println("linkList.get(2) : " + linkList.get(2));
        System.out.println("linkList.get(3) : " + linkList.get(3));
        System.out.println("linkList.get(4) : " + linkList.get(4));

//
//        for (String s : linkList) {
//            System.out.println(s);
//        }
//
//        System.out.println();

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