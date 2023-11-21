package randomgame;

public class RandomNum {

    private int random;

    public RandomNum() {
    }

    public int getRandom() {
        return random;
    }

    public void setRandom() {
        random = (int) (Math.random() * 31) + 70;
    }
}
