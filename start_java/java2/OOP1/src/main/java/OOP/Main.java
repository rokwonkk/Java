package OOP;

public class Main {
    public static void main(String[] args) {

        /**
         *  class : 객체지향의 설계도
         *
         *  클래스 설계(선언)
         *  형식 : Class 클래스명{
         *      변수선언
         *
         *      함수(method)선언부 == 멤버함수 == 메소드
         *  }
         *
         *  클래스 생성
         *  클래스명 변수 = new 클래스명();
         *
         */
        MyClass cls = new MyClass();
//        cls : (Class)변수 == 객체, instance(주체)
//              stack           heap

        cls.number = 1000;
        cls.name = "홍길동";
        cls.height = 182.4;

        cls.method();
    }
}

class MyClass {
    // MyClass에 소속되어있는(멤버) 함수
    /** (멤버)변수 선언부 **/
    int number;
    String name;
    double height;

    /** 매소드(멤버함수) 선언부 **/
    void method() {
        System.out.println("MyClass method()");
    }
}