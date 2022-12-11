package baseball.model;

public class Judge {
    private int ballResult;
    private int strikeResult;

    public Judge(Balls userBalls, Balls computerBalls) {
        this.ballResult = 0;
        this.strikeResult = 0;
        judgeBallsAndStrike(userBalls, computerBalls);
    }

    private void judgeBallsAndStrike(Balls userBalls, Balls computerBalls) {
        for (int i = 0; i < Balls.BALLS_LENGTH; i++) {
            if (userBalls.contains(computerBalls.get(i))) {
                ballResult++;
            }
        }
        judgeStrike(userBalls, computerBalls);
        ballResult = ballResult - strikeResult;
    }

    private void judgeStrike(Balls userBalls, Balls computerBalls) {
        for (int i = 0; i < Balls.BALLS_LENGTH; i++) {
            if (userBalls.get(i).equals(computerBalls.get(i))) {
                strikeResult++;
            }
        }
    }

    public int getBallResult() {
        return ballResult;
    }

    public int getStrikeResult() {
        return strikeResult;
    }
}
