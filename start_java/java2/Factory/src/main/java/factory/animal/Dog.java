package factory;

public class Dog implements Animal{

    @Override
    public void printDescript() {
        System.out.println("뭉뭉이입니다만?");
    }

    public void dogMethod(){
        System.out.println("몽뭉멍");
    }
}
