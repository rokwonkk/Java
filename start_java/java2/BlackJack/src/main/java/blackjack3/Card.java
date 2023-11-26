package blackjack3;

public class Card {

    private final String pattern;
    private final String number;

    public Card(String pattern, String number) {
        this.pattern = pattern;
        this.number = number;
    }

    public String getPattern() {
        return pattern;
    }

    public String getNumber() {
        return number;
    }

    public int getValue() {
        switch (number) {
            case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "10":
                return Integer.parseInt(number);
            case "J": case "Q": case "K":
                return 10;
            case "A":
                return 11;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return number + " of " + pattern;
    }
}
