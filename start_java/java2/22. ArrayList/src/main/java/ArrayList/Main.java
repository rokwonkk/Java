package ArrayList;

import ArrayList.dto.HumanDto;

import java.util.ArrayList;
import java.util.Arrays;
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

        /**
         *  ArrayList를 사용해도되고 List를 사용해도 되지만.
         *  ArrayList는 클래스, List는 인터페이스 이기 때문에 인터페이스를 사용하는
         *  습관을 들이기 위해 나는 List를 사용하겠다.
         **/
        //ArrayList<Integer> arrList = new ArrayList<Integer>();
        //List<Integer> arrList = new ArrayList<Integer>();

        /**
         *  동적인 배열을 선언! ArrayList arrList[] = new ArrayList[];
         */
//        ArrayList<Integer> arrList = new ArrayList<Integer>();
//
//        List<Integer> list = new ArrayList<Integer>();
//
//        //추가
//        list.add(1111);
//
//        //정석
//        Integer in = new Integer(2222);
//        list.add(in);
//
//        list.add(new Integer(3333));
//
//        //목록의 크기
//        int len = list.size(); // length와 동일
//        System.out.println("size : " + len);
//
//        //목록에서 데이터 산출
//        Integer ii = list.get(0);
//        System.out.println("ii : " + ii);
//
//        //모든 데이터를 출력
//        for(int i = 0; i < list.size(); i++){
//            Integer find = list.get(i);
//            System.out.println(i +" : " + find);
//        }
//
//        for (Integer i : list) {
//            System.out.println("forEach : " + i);
//        }
//
//        //원하는 위치에 추가 0 ~ 2 -> 1111 2222 3333 <- 3000 ( 2222 요기 3333)
//        Integer inum = 3000;
//        list.add(2, inum);
//
//        for (Integer i : list) {
//            System.out.println("forEach2 : " + i);
//        }
//
//        //삭제
//        list.remove(1); // 번지수로 날리는걸 더 많이 사용한다.
////        list.remove(new Integer(3000)); // 고정으로 날리는건 잘 안사용하지.
//        for(int i = 0; i < list.size(); i++){
//            Integer find2 = list.get(i);
//            System.out.println(i + " : " + find2);
//        }
//
//        //검색
//        int index = list.indexOf( 3000 );
//        System.out.println("index : " + index);
//        System.out.println("find index : " + list.get(index));
//
//        int findData = -1;
//        for (int i = 0 ; i < list.size(); i++){
//            Integer n = list.get(i);
//            if(n == 3333){
//                findData = i;
//                break;
//            }
//        }
//        System.out.println("findData : " + findData);
//
//        //수정
//        Integer newInt = 5555;
//        list.set(1, newInt);
//
//        for(int i = 0; i < list.size(); i++){
//            Integer find3 = list.get(i);
//            System.out.println(i +" : " + find3);
//        }

        List<String> list = new ArrayList<>();

        //추가
        list.add("배움의");
        list.add("깊이는");
        list.add("끝이");
        list.add("없다");

        String str = "자바는";
        list.add(0, str);

        list.remove(2);

        System.out.println("list.size() : " + list.size());
        System.out.println("list.contains(\"자바는\") : " + list.contains("자바는"));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

//        for (String s : list) {
//            System.out.print(s + " ");
//        }

        //원하는 위치에 추가
//        String addStr = "자바의";
//        list1.add(0, addStr);

        //출력
//        for (String s : list1) {
//            System.out.print(s + " ");
//        }
//
//        System.out.println();
//        //삭제
//        list1.remove(1);
//
//        //출력
//        for (String s : list1) {
//            System.out.print(s + " ");
//        }
//
//        System.out.println();
//
//        //검색
//        int findStr = list1.indexOf("없다");
//
//        int findData = -1;
//        for (int i = 0 ; i < list1.size(); i++){
//            String n = list1.get(i);
//            if(n.equals("없다")){
//                findData = i;
//                break;
//            }
//        }
//        System.out.println("findData : " + findData);
//
//        String updateStr = "깊이와 배움은";
//        list1.set(1, updateStr);
//        for (String s : list1) {
//            System.out.print(s + " ");
//        }
//
//        System.out.println();
//        System.out.println("-------------------------------------------------------------");
//
//        List<HumanDto> hlist = new ArrayList<HumanDto>();
//        //추가 방법1
//        String name = "홍길동";
//        int age = 24;
//        double height = 172.1;
//
//        HumanDto dto = new HumanDto(name, age, height);
//        hlist.add(dto);
//
//        //추가 방법2
//        hlist.add(new HumanDto("성춘향", 16, 158.4));
//        hlist.add(new HumanDto("일지매", 21, 181.1));
//        hlist.add(new HumanDto("홍두께", 28, 179.0));
//
//        for (int i = 0; i < hlist.size(); i++) {
//            HumanDto h = hlist.get(i);
//
////            System.out.println(h.toString());
//            System.out.println(h.getName());
//        }
//
//        for (HumanDto h : hlist) {
//            System.out.println(h.toString());
//        }
//        System.out.println();
//
//        //원하는 위치에 추가
//        HumanDto addhuman = new HumanDto("홍두께", 25, 176.9);
//        hlist.add(1, addhuman);
//
//        for (HumanDto h : hlist) {
//            System.out.println(h.toString());
//        }
//        System.out.println();
//
//        //삭제
//        int findindex = -1;
//        for (int i = 0; i < hlist.size(); i++) {
//
//            HumanDto h = hlist.get(i);
//            if (h.getName().equals("성춘향")){
//                findindex = i;
//                break;
//            }
//        }
//
//        if (findindex != -1){
//            hlist.remove(findindex);
//        }
//
//        for (HumanDto h : hlist) {
//            System.out.println(h.toString());
//        }
//
//        System.out.println();
//
//        //새로운 List를 또 만들어서 검색 동명이인을 찾아서 거기다 넣어두어서 동명이인 출력
//        List<HumanDto> findList = new ArrayList<HumanDto>();
//        for (int i = 0; i < hlist.size(); i++) {
//            HumanDto h = hlist.get(i);
//
//            if (h.getName().equals("홍두께")){
//                findList.add(h);
//            }
//        }
//        for (HumanDto h : findList) {
//            System.out.println(h.toString());
//        }
//
//        //수정
//        findindex = -1;
//        for (int i = 0; i < hlist.size(); i++) {
//            HumanDto h = hlist.get(i);
//            if (h.getName().equals("성춘향")){
//                findindex = i;
//                break;
//            }
//        }
//
//        System.out.println();
//
//        //list 안에 Object를 변경하는 것을 의미 ( 일지매 -> 아무게 )
//        HumanDto hman = new HumanDto("아무게", 31, 177.7);
//        hlist.set(2, hman);
//
//        for (HumanDto h : hlist) {
//            System.out.println(h.toString());
//        }
//
//        System.out.println();
//        //list 안에 데이터를 수정하는 것을 의미 홍길동 (키, 나이 수정) 찾았다고 가정.
//        HumanDto man = hlist.get(0);
//        man.setAge(20);
//        man.setHeight(180.0);
//
//        for (HumanDto h : hlist) {
//            System.out.println(h.toString());
//        }
//
//        //참고 Object는 모든것을 담는다.
//        List<Object> allDataList = new ArrayList<>();
//        allDataList.add(new String("하이"));
//        allDataList.add(new HumanDto("신하이",23,521.1));
//        allDataList.add(hlist);
//
//        System.out.println();
//
//        //Array -> list
//        String arr[] = {"hello", "world", "hi"};
//
//        //이렇게 하면 list로 변경은 되지만 list를 정상적으로 사용할 수 없다.
//        //List<String> li = Arrays.asList(arr);
//
//        List<String> li = new ArrayList<String>();
//        li.addAll(Arrays.asList(arr)); // list에 추가하는 부분
//
//        li.add(new String("good"));
//
//        for (int i = 0; i < li.size(); i++) {
//            String s = li.get(i);
//            System.out.println(s);
//        }
//
//        System.out.println();
//
//        //list -> Array
//        List<String> slist = new ArrayList<String>();
//        slist.add("Tigers");
//        slist.add("Giants");
//        slist.add("Twins");
//
//        int slistSize = slist.size();
//        String arrStr[] = slist.toArray(new String[slistSize]);
//
//        for (int i = 0; i < arrStr.length; i++) {
//            System.out.println(arrStr[i]);
//        }
    }
}