package baseball.Dto;

public class BatterDto extends HumanDto{

    private String position;
    private int batcount;
    private int hit;
    private double hitAvg;

    public BatterDto(int number, String name, int age, double height, String position, int batcount, int hit, double hitAvg) {
        super(number, name, age, height);
        this.position = position;
        this.batcount = batcount;
        this.hit = hit;
        this.hitAvg = hitAvg;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBatcount() {
        return batcount;
    }

    public void setBatcount(int batcount) {
        this.batcount = batcount;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public double getHivAvg() {
        return hitAvg;
    }

    public void setHivAvg(double hivAvg) {
        this.hitAvg = hivAvg;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + getPosition() + "-" + getBatcount() + "-" + getHit() + "-" + getHivAvg();
    }
}
