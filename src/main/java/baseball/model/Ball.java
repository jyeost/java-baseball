package baseball.model;

public class Ball {

    private final int number;

    public Ball(String number) {
        this((int) Integer.valueOf(number));
    }

    public Ball(int number) {
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        Ball ball = (Ball) obj;
        return this.number == ball.number;
    }


}
