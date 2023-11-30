package example;

import example.cls.Child;

public class Main {
    public static void main(String[] args) {

        /**
         *  은닉성(캡슐화)        -> 외부로부터의 접근을 설정 ( 차단 private / 허용 public )
         *
         *  상속성 inheritance    -> 부모클래스로부터 기능을 상속 variable(변수) method(함수) -> 물려받는 것
         *  다형성 polymorphism   -> 상속 후에 여러가지 형태의 자식 클래스 구성되는 것
         *
         *  this -> 자기자신의 포인터 주소 , super -> 부모 클래스의 instance(객체)를 가리키는 주소
         *
         *  형식 :
         *
         *      class 부모클래스{
         *          부모변수
         *          부모메소드
         *      }
         *
         *      class 자식클래스 extends 부모클래스{
         *          -> 보이진 않지만 부모쪽도 같이 자식클래스에 같이 있는거임.
         *          (부모변수)
         *          (부모메소드)
         *      }
         */

        Child child = new Child();
        //Child에선 없지만 Child가 Parent를 상속받았기 때문에 Child에서 Parent에 있는 메서드를 사용할 수 있다.
        child.Parent_method();
        child.func();
        System.out.println(child.getAddress());
    }
}