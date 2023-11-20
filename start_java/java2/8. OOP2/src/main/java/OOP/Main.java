package OOP;

import cls.MyClass;

public class Main {
    public static void main(String[] args) {
        /**
         *  Object Oriented Programming (OOP)
         *  목적 : 소스관리
         *
         *  특징 :
         *          1. 은닉성(캡슐화)
         *              외부(class 밖)과 분리하여 변수를 접근하는 것
         *              접근지정자를 설정하여 접근 차단과 허용을 할 수 있다.
         *
         *              접근지정자: private(개인적인)    -> 외부 접근 차단
         *                          public(대중적인)     -> 어디서든 접근 가능
         *                          protected(보호하다)  -> 상속에 관련하여 자식(연관)클래스에 대한 접근
         *
         *          2. 상속성
         *          3. 다형성
         */

        MyClass cls = new MyClass();
        cls.setName("홍길동");

        /* private 멤버 변수 접근시 */
        cls.setNumber(1111);
        int num = cls.getNumber();
        System.out.println(num);

//        cls.height = 181.1;
    }
}