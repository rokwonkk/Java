package factory.animal;

public class Cat implements Animal{

    @Override
    public void printDescript() {
        System.out.println("야옹입니다만?");
    }

    public void catMethod(){
        System.out.println("옹야 옹야");
    }

}
