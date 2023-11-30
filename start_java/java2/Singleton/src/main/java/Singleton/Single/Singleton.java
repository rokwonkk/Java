package Singleton.Single;

public class Singleton {

    //static으로 잡아주고
    private static Singleton sl = null;

    //public으로 만들던 private로 만들꺼면 게터세터만들어줘야함.
    public String name;
    public String address;

    //외부에서 접근을 불가능하게 만들어놓고
    private Singleton() {
    }

    //이 클래스는 무적권 하나만 생선된다는 것을 알 수 있다.
    public static Singleton getInstance() {
        if (sl == null) {
            sl = new Singleton();
        }
        return sl;
    }
}
