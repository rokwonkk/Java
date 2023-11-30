package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /**
         *  Collection
         *
         *  interface : Map
         *
         *  HashMap : 사전
         *              "apple" : "사과"
         *              key     : value
         *              (이진)tree 구조
         *              index로 관리, 접근하는 것이 아니다.
         *              key 값은 중복을 허용하지 않는다.
         *
         *  TreeMap : HashMap + Sorting(key)
         *            HashMap에 비해서 효율은 떨어진다.
         */

        Map<Integer, String> map = new HashMap<>();

        //추가
        map.put(1, "사과");
        map.put(22, "바나나");
        map.put(333, "딸기");
        map.put(new Integer(4444), new String("키위"));
        map.put(55555, new String("멜론"));

        //Map의 크기
        System.out.println("node의 총 수 : "+map.size());

        //value 취득
        String value = map.get(333);
        System.out.println(value);

        //삭제
        String val = map.remove(22);
        System.out.println(val +"값이 삭제되었습니다");

        //검색
        //있다 / 없다. <- Key값으로만 찾음
        boolean valYn = map.containsKey(new Integer(333));
        System.out.println(valYn);

        //찾아서 값을 취득
        if(map.containsKey(333)){
            val = map.get(333);
            System.out.println(val);
        }

        //수정
        map.replace(333, "300 + 33");
//        map.replace(333, "333 + 22 + 1");

        String s = map.get(333);
        System.out.println(s);

        System.out.println();

        //모두 출력
        //Iterator 사용
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String _value = map.get(key);

            System.out.println("key : " + key + " value : " + value);
        }
        //모두 출력
        //forEach
        for (Integer i : map.keySet()) {
            System.out.println("key : " + i + " value : " + map.get(i));
        }

        System.out.println();

        Map<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("audi", "아우디");
        hashMap.put("bmw", "비엠따");
        hashMap.put("benz", "빤즈");
        hashMap.put("kia", "키아");

        System.out.println("해시맵은 정렬안됨");
        for (String key : hashMap.keySet()) {
            System.out.println("key : " + key + " value : " + hashMap.get(key));
        }

        System.out.println();

        //Sorting (정렬)
        //HashMap -> TreeMap ( 바꿀 자료형이 둘다 동일해야함 )
        TreeMap<String, String> treeMap = new TreeMap<String, String>(hashMap);
        System.out.println("트리맵으로 정렬 ! 키 값으로 정렬됨 오름차순 정렬 (keySet)");
        for (String ts : treeMap.keySet()) {
            System.out.println("key : " + ts + " value : " + treeMap.get(ts));
        }

        System.out.println("트리맵으로 정렬 ! 키 값으로 정렬됨 내림차순 정렬 (descendingKeySet)");
        for (String ts : treeMap.descendingKeySet()) {
            System.out.println("key : " + ts + " value : " + treeMap.get(ts));
        }

        /*********** 제일 많이 쓰는 형식 *************/
        Map<String, Object> objMap = new HashMap<>();

        objMap.put("이름", "홍길동");
        objMap.put("나이", new Integer(24));
        //objMap.put("학생데이터", dto);

        /*********************************************/
    }
}