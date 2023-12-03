package factory.partfactory;

public class Screw implements Part{
    @Override
    public void make() {
        System.out.println("나사를 만들어 볼까?");
    }
}
