package example;

public class Main {
    public static void main(String[] args) {
        /**
         *  Overload : 함수(메서드)명은 같고
         *              매개변수(인수, 인자)의 자료형이나
         *              매개변수의 갯수가 다른 것을 의미한다.
         *
         *              같은 이름의 다른 함수
         *              매개변수의 위치도 다르면 다른 함수라고 인지
         *
         *              imageDraw(int x, int y)
         *              imageDraw(int x, int y, int a) -> 0.0 ~ 1.0
         */

        func();

        func('A');

        func(0);

        func(0.2, "하이");

        func( "하이", 0.2);
    }

    static void func(){
        System.out.println("func() 호출");
    }

    //static int func(){} -> return 값이 다른 것은 overload가 아니다.

    static void func(char c){
        System.out.println("func(char c) 호출");
    }

    //static void func(char a){} -> 가인수가 다른 것은 적용이 안된다. (자료형으로 구분하기 때문에)

    static void func(int i){
        System.out.println("func(int i) 호출");
    }

    static void func(double d, String str){
        System.out.println("func(double d, String str) 호출");
    }

    static void func(String str, double d){
        System.out.println("func(String str, double d) 호출");
    }
}