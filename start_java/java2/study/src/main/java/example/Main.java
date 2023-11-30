package example;

public class Main {
    public static void main(String[] args) {
        /**
         *  절차지향    ->      객체지향
         *  순서
         *  (1->2->3)           (1->2->3) -> (1->2->3)
         *
         *  Object Oriented Programming
         *
         *  class -> object1, object2
         *  (멤버)variable
         *  (멤버)method
         */

        //my는 stack에 생성  new MyClass는 heap에 생성
        MyClass my = new MyClass();
        // (클래스)변수 = 객체(obj), instance(주체)

        my.name = "홍길동";
        my.setNumber(1024);

        int num = my.getNumber();
        System.out.println(num);
    }
}

class MyClass{

    /**
     *  구현부가 아닌 설계부.
     *  여기서 값넣는게 아님.
     */
    //(멤버)변수의 선언
    private int number; // -> 클래스 내부 접근 허용
    public String name; // -> 어디서나 접근 허용
    protected double height; // ->

    // private이라도 getter, setter를 통해서 접근 가능


    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    //(멤버)함수의 선언
    public void method() {

    }

    public void func() {

    }
}
