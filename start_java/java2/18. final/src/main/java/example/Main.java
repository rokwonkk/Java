package example;

public class Main {
    public static void main(String[] args) {

        /**
         *  final : 제약
         *  변수, 메소드, 클래스 적용가능
         *  더이상은 없다 바꾸지마라.
         *  느낌적으로는 그냥 상속에 대한 boolean : true false의 느낌.
         */

        final int number = 10; // 변수 -> 상수
//        number = 20;

        int num = number;       //초기값
        final int MAX = 100; //final은 대문자를 많이씀
        final int MIN = 10; //final은 대문자를 많이씀
        int count = 25;

        if (count > MIN && count <= MAX){

        }
    }
}

//클래스에 final은 상속금지
final class Parent {

    //메소드의 final은 상속은 되지만 Override 금지
    public final void method(){   //virtual function

    }
}

//class Child extends Parent{
//    @Override
//    public void method(){   //Override
//        System.out.println("Child.method");
//    }
//}