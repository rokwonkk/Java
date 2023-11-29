package example;

import example.inter.HeClass;
import example.inter.MyClass;
import example.inter.MyInterface;
import example.inter.YouInterface;

public class Main {
    public static void main(String[] args) {

        /**
         *  abstract class : abstract method + method + variable
         *               (다중상속이 불가능)
         *
         *  interface : abstract method 로만 구성이 되어 있는 (class.. 클래스라고 하긴 좀 그렇지만 설명을 붙이자면 interface는 interface이다.)
         *               (선언되어 있는 메소드로만 구성)
         *               (인터페이스는 다중상속이 가능)
         *               (빠르게 클래스 설계가능, 구성을 파악이 가능)
         *               (확장성에서 우수하다)
         *
         */
//        MyInterface myInter = new MyInterface() {
//            @Override
//            public void abMethod() {
//                System.out.println("MyInterface abMethod()");
//            }
//        };
//        myInter.abMethod();

        MyClass myCls = new MyClass();
        myCls.abMethod();
//
//        MyInterface my = new MyClass();
//        my.abMethod();
//
//        HeClass hc = new HeClass();
//        hc.abMethod();
//        hc.func();
    }
}


/**
 * //자바에서는 다중상속이 불가능하다
 */
class ParentOne{

}

class ParentTwo{

}


class Child extends ParentOne, ParentTwo{

}

class Child implements MyInterface, YouInterface{

}