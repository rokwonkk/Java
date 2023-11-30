package example.cls;

public class Child extends Parent{
    public void func(){
        name = "홍길동";

        //public은 그냥 접근가능하고
        //private는 게터세터로 접근하면 됨.
        setName("이록원");
        setNumber(100);
        setAddress("대연동");

        System.out.println(getName());
        System.out.println(getNumber());
    }
}
