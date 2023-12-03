package factory.partfactory;

public class Nut implements Part{
    @Override
    public void make() {
        System.out.println("너트를 만들어 볼까?");
    }
}
