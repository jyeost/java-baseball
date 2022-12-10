package baseball.model;

public class Ball {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    private final int number;


    public Ball(String number) {
        this((int) Integer.valueOf(number));
    }

    public Ball(int number) {
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        Ball ball = (Ball) obj;
        return this.number == ball.number;
    }


}
