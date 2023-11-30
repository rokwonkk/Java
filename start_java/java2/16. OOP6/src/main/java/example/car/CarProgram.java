package example.car;

public class CarProgram {
    public static void main(String[] args) {

        Kind kind = new Kind();
        kind.speedUp();

        Kind audi = new Audi();
        Audi audiCar = (Audi) audi;
        audiCar.speedUp();
        audiCar.audi_method();

        Kind bmw = new Bmw();
        Bmw bmwCar = (Bmw) bmw;
        bmwCar.speedUp();
        bmwCar.bmw_method();
    }
}
