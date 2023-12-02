package factory;

public class Cow implements Animal{

    @Override
    public void printDescript() {
        System.out.println("황소입니다만?");
    }

    public void cowMethod(){
        System.out.println("음~ 모 ");
    }
}
