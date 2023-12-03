package factory.partfactory;

public class Washer implements Part{
    @Override
    public void make() {
        System.out.println("와셔를 만들어 볼까?");
    }
}
