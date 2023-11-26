package example;

public class Main {
    public static void main(String[] args) {
        /**
         *  abstract class : 추상 클래스
         *               추정해서 상상한다. 추상 메소드를 하나이상 포함하고 있는 클래스
         *  abstract method : 추상 함수
         *               내용은 없고 선언만 되어 있는 함수
         */
        /**
         *  일반 함수
         *  public void method(int 내용){
         *      내용
         *  }
         *
         *  추상 함수
         *  public abstract void method(int i); <- 함수의 사양(proto type)
         *  상속후에 (customizing)클래스에 원하는 데로 구현하는 것.
         */
        //1. data가 많을때
//        MyClass cls = new MyClass();
//        cls.method();
//        cls.abstractMethod();

        //2. data가 하나만 필요할때
//        AbstractClass ac = new AbstractClass() {
//            @Override
//            public void abstractMethod() {
//                System.out.println("AbstractClass abstractMethod()");
//            }
//        };
//        ac.method();
//        ac.abstractMethod();

        //3.
        AbstractClass ac = new MyClass();
        ac.method();
        ac.abstractMethod();
    }
}

abstract class AbstractClass{

    private String name;

    //추상메서드
    public abstract void abstractMethod();

    public void method(){
        System.out.println("AbstractClass abstractMethod()");
    }
}

class MyClass extends AbstractClass{
    @Override
    public void abstractMethod(){
        System.out.println("MyClass abstractMethod()");
    }
}