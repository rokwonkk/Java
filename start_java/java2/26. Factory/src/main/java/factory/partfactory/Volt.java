package factory.partfactory;

public class Volt implements Part{
    @Override
    public void make() {
        System.out.println("볼트를 만들어 볼까?");
    }
}
