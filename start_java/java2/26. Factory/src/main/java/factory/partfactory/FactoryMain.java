package factory.partfactory;

public class FactoryMain {
    public static void main(String[] args) {

        PartFactory factory = new NutFactory();
        Part nut = factory.createPart();

        nut.make();
    }
}
