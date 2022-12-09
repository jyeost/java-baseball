package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    public static final int BALLS_LENGTH = 3;
    private List<Ball> balls;

    public Balls() {
    }

    public Balls(String userInput) throws IllegalArgumentException {
        balls = new ArrayList<>();
        validateLength(userInput);
        validateIsNumber(userInput);
        makeUserBalls(userInput);
    }

    public void makeRandomBalls() {
        balls = new ArrayList<>();
        while (balls.size() < BALLS_LENGTH) {
            Ball ball = new Ball(Randoms.pickNumberInRange(1, 9));
            if (!balls.contains(ball)) {
                balls.add(ball);
            }
        }
    }

    private void validateLength(String userInput) {
        if (!(userInput != null && userInput.length() == BALLS_LENGTH)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateIsNumber(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private void makeUserBalls(String userInput) throws NumberFormatException {
        for (String number : userInput.split("")) {
            Ball ball = new Ball(number);
            if (!balls.contains(ball)) balls.add(ball);
        }
        if (balls.size() != 3) throw new IllegalArgumentException();
    }

    public boolean contains(Ball ball) {
        return this.balls.contains(ball);
    }

    @Override
    public boolean equals(Object obj) {
        Balls balls = (Balls) obj;
        return this.balls.equals(balls.balls);
    }

    public Ball get(int index) {
        return balls.get(index);
    }


}
