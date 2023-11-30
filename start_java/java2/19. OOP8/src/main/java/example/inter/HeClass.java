package example.inter;

public class HeClass implements MyInterface, YouInterface{
    @Override
    public void abMethod() {
        System.out.println("HeClass.abMethod()");
    }

    @Override
    public void func() {
        System.out.println("HeClass.func()");
    }
}
