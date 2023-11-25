package baseball.Dto;

public class BatterDto extends HumanDto{

    private String position;
    private int batcount;
    private int hit;
    private double hivAvg;

    public BatterDto(int number, String name, int age, double height, String position, int batcount, int hit, double hivAvg) {
        super(number, name, age, height);
        this.position = position;
        this.batcount = batcount;
        this.hit = hit;
        this.hivAvg = hivAvg;
    }

    public BatterDto() {

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
        return hivAvg;
    }

    public void setHivAvg(double hivAvg) {
        this.hivAvg = hivAvg;
    }
}
