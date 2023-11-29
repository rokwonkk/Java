package example;

public class Main {
    public static void main(String[] args) {

        {
            int num;
        }


        /**
         *  local variable : 지역변수 -> stack
         *  parameter variable : (지역변수) -> stack
         *  member variable : 멤버변수 -> heap
         *
         *  stack / heap / static /
         *  static은 너무 남발하면 프로그램이 무거워짐.
         *  static variable : global variable 정적변수 -> static
         *  static function
         */

        int number = 1;     //local(지역, 자동) 변수      -> stack에 올라감
        {
            // 구역 {  }
            int num;
//            System.out.println(num);
        }
//        System.out.println( MyClass.counting );
//
//        MyClass.staticMethod();

        MyClass cls = new MyClass();
        cls.func();
        cls.func();
        cls.func();

        MyClass cls1 = new MyClass();
        cls1.func();
        cls1.func();

        cls.func();
        cls1.func();
    }

    public static void func(){
        String str = "hello";   //local 변수      -> stack에 올라감 함수 { 구역 }
    }

    public static void method(int n){ // parameter  -> stack에 올라감 함수 { 구역 }

        n = 1;

    }
}

class MyClass {
    private String name;        // class member 변수 -> heap에 올라감
                                // 멤버 변수는 자동 초기화 되기 때문에 초기화를 시켜주지 않는것. local변수는 초기화 시켜줘야함.

    int number = 0;
    static int counting = 0; //정적변수

//    static int counting = 111;        //정적변수

    public static void staticMethod(){  //class method
        System.out.println("MyClass.staticMethod");
    }

    public void func(){     //intance method
        int num = 0;

        num = num + 1;
        System.out.println("지역변수: num = " + num);

        number = number + 1;
        System.out.println("멤버변수: num = " + number);

        MyClass.counting = MyClass.counting + 1;
        System.out.println("정적변수: counting = " + counting);
    }
}