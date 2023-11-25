package baseball.Dto;

public class PicherDto extends HumanDto{

    private String position;
    private int win;
    private int lose;
    private double defence;

    public PicherDto(int number, String name, int age, double height, String position, int win, int lose, double defence) {
        super(number, name, age, height);
        this.position = position;
        this.win = win;
        this.lose = lose;
        this.defence = defence;
    }

    public PicherDto() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }
}
