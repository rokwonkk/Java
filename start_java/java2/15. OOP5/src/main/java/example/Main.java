package example;

import example.cls.Child;
import example.cls.Child2;
import example.cls.Parent;

public class Main {
    public static void main(String[] args) {

        //extends의 부모먼저 생성되고, 그다음 자식이 생성됨.
//        Child child = new Child();
//        child.Method();

        Parent parent = new Parent();
        parent.Method();

        Child child = new Child();
        child.Method();

        Child2 child2 = new Child2();
        child2.Method();

//        child.ChildMethod();

//        Child child = new Child("홍길동");
        //Parent parent = new Parent();

    }
}