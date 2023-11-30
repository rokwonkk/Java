package example.cls;

public class Child extends Parent{
    public void func(){
        System.out.println("Child func()");
    }


    @Override // <- namespae 주석(제시어)문
    public void method() {
        System.out.println("Child method()");
    }
}
