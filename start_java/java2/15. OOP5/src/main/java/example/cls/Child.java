package example.cls;

import java.lang.reflect.Method;

public class Child extends Parent{

    public Child() {
        //System.out.println("Child Child()");
    }

//    public Child(String name){
//        super(name);
//        //this(); 생성자에서는 this와 super를 같이 사용할 수 없다.
//    }

//    public void Method() {
//        /**
//         *   위에 상속받은 method가 부족해서 더 추가하기 위해서
//         *         OverRide (상속받은 클래스에서 고쳐기입)
//         */
////        super.method();
//        System.out.println("Child method()");
//    }

    public void ChildMethod() {
        /**
        *   위에 상속받은 method가 부족해서 더 추가하기 위해서
         *         OverRide (상속받은 클래스에서 고쳐기입)
        */
//        super.method();
        //System.out.println("Child ChildMethod()");
    }

    @Override
    public void Method() {
        System.out.println("강철빗자루");
    }
}
