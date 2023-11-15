package main;

public class Application {

    public static void main(String[] args) {
        /**
         *  String :
         *      wrapper class
         *      문자열을 저장, 편집, 정보취득
         *
         *  객체 : 동적할당
         *      클래스명 변수 = new 클래스명();
         *
         *      wrapper class는 new 오퍼레이션을 빼도 작동함.
         */

        String str; // String == 클래스명(Class), str == 객체(obj) -> class 변수
        str = "안녕하세요";
        System.out.println("str : " + str);

        //정석
        String str1 = new String();
        str1 = "반갑습니다";
        System.out.println("str : " + str1);

        /**
         *  문자열길이
         *  length()
         */
        int len = str1.length();
        System.out.println(len);

        /**
         *  문자열 합치기 -> concat , +
         */
        //String str2 = str.concat(str1);
        String str2 = str + str1;
        System.out.println(str2);

        /**
         *  문자열 자르기
         *  split : token을 이용해서 문자열을 자른다.
         *  hello-my-world '-' : token
         *
         *  홍길동 24 부산시
         *  성진 22 서울특별시
         *
         *  substring : 범위를 지정해서 문자열을 자른다
         */
        String str3 = "홍길동-24-2001/11/06-192.5";
        String splitArr[] = str3.split("-");
        for (String s : splitArr) {
            System.out.println(s);
        }

        String str4 = "하이 반갑습니다";
        String str5 = str4.substring(0, 2);
        System.out.println(str5);

        str5 = str4.substring(3, 5);
        System.out.println(str5);

        str5 = str4.substring(3);
        System.out.println(str5);
        /**
         *  비교함수 -> equals
         */
        String str6 = "hello";
        String str7 = "helloworld";

        boolean b = str6.equals(str7);
        System.out.println(b);


        /**
         *  지정문자의 위치 -> indexOf
         */
        String str8 = "안녕하세요 반갑습니다";
        System.out.println(str8.length());

        int num = str8.indexOf("하");
        System.out.println(num);

        /**
         *  수정 -> replace
         */
        String str9 = "A*B*C";
        String str10 = str9.replace("*", "+");
        System.out.println(str10);

        /**
         *  대문자, 소문자 변경 (모두) 변경
         *  toUpperCase, toLowerCase
         */
        String str11 = "abcEDF";
        String str12 = str11.toUpperCase();
        System.out.println(str12);

        str12 = str11.toLowerCase();
        System.out.println(str12);

        /**
         *  (앞뒤) 공백 제거 함수 (중간x 중간공백제거는 replace사용)
         *  trim
         */
        String str13 = "                  java C언어 python       ";
        String str14 = str13.trim();
        System.out.println(str14);

        /**
         *  탐색 -> contains
         */
        String str15 = "부산시 수영구";
        boolean b1 = str15.contains("수 영");
        System.out.println(b1);

        /**
         *  charAt -> 한문자 찾기
         */
        String str16 = "hello";
        char c = str16.charAt(1);
        System.out.println(c);
    }
}