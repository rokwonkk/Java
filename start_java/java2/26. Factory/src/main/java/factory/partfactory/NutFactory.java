package factory.partfactory;

class NutFactory implements PartFactory{

    @Override
    public Part createPart() {
        return new Nut();
    }
}
