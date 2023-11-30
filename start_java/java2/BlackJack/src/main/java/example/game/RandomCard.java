package example.game;

public class RandomCard {

    private int number;

    public int getRandom() {
        return number;
    }

    public int setRandom() {
        return (int)(Math.random() * 2) + 1;
    }

}
