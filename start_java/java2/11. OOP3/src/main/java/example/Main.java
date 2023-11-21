package example;

public class Main {
    public static void main(String[] args) {

        /**
         *  constructor :   생성자
         *                  메서드(함수)
         *                  class명과 같은 명칭의 함수
         *                  return 값이 없다
         *                  객체 생성시에 자동 호출된다
         *                  다시 호출할 수는 없다( 초기화와는 다름 )
         *                  기본 값을 설정하는 경우가 많다
         *                  over load가 가능하다
         *
         *  destructor  :   소멸자
         *                  현재는 사용 안함
         */

//        int array[] = new int[5];
//        int array[] = {1, 2, 3, 4, 5};

//        MyClass cls = {1, "홍길동", 181.2}; X

//        MyClass cls = new MyClass();

//        MyClass cls1 = new MyClass(111);

//        MyClass cls2 = new MyClass(111, "홍길동", 192.1);

        /**
         *  this 키워드(포인터) -> 각 함수의 0번째 매개변수로 생성된 자기자신의 주소이다
         *  맴버변수가 맞냐 아니냐를 판별 할때 사용이 된다.
         */
//        MyClass cls = new MyClass();
//        System.out.println(cls);

        // 힙 영역의 주소를 가르킴, 현재 생성된 객체에 대한 주소값을 가르킴
//        System.out.println(cls.getThis());
//
//        MyClass my = new MyClass();
//        System.out.println(my);
//        System.out.println(my.getThis());

        YouClass ycls = new YouClass(1, "홍길동");
    }
}

class MyClass{
    int number;
    String name;
    double height;

    /**
     *  기본 생성자
     */
    public MyClass() {
        System.out.println("MyClass MyClass()");
        number = 0;
        name = "";
        height = 0.0;

    }

    public MyClass(int number) {
        System.out.println("MyClass MyClass(int number)");
        number = 0;

    }

    public MyClass(int number, String name, double height) {
        this.number = number;
        this.name = name;
        this.height = height;
        System.out.println("MyClass MyClass(int number, String name, double height)");
    }

    public MyClass getThis(){
        return this;
    }
}

class YouClass{

    private int number;
    private String name;

    public YouClass() {
        System.out.println("YouClass YouClass()");
    }


    // 구분자로 쓸때 this를 많이씀.
    public YouClass(int number, String name) {
        this();     // 기본 생성자 호출, this만 호출할때에는 제일 위에 있어야한다.
        System.out.println("YouClass YouClass(int number, String name)");
        this.number = number;
        this.name = name;
    }
    public int getNumber() {
        // 구분해줄 필요없을 때 this. 생략
        //return this.number;
        return number;
    }

    public void setNumber(int number) {
        //this. << 멤버변수
        this.number = number;
    }

    public void method(){
        int number = 123; // 지역변수
        this.number = number;
    }
}