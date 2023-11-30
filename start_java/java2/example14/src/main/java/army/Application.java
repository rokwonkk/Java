package army;

public class Application {
    public static void main(String[] args) {

        Unit unit[] = new Unit[20];

        unit[0] = new Marine();
        unit[1] = new Dropship();
        unit[2] = new Tank();
        unit[3] = new Marine();
        unit[4] = new Marine();
        unit[5] = new Marine();

        unit[0].move(150, 200);
        unit[1].move(1200, 400);
        unit[2].move(500, 100);

        unit[0].stop();
        unit[1].stop();
        unit[2].stop();

        // 쓰는 방식은 다양하다.
        for (int i = 0; i < unit.length; i++) {
            if (unit[i] instanceof Marine marine){
                marine.stimPack();
            } else if (unit[i] instanceof Dropship dropship) {
                Dropship d = (Dropship)dropship;
                d.load();
                d.unload();
            } else if (unit[i] instanceof Tank) {
                ((Tank)unit[i]).changeMode();
            }
        }
    }
}