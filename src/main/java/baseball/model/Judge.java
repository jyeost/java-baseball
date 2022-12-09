package baseball.model;

public class Judge {

    public Judge(Balls userBalls, Balls computerBalls) {
        JudgeResult.BALL.initCount();
        JudgeResult.STRIKE.initCount();

        judgeBallsAndStrike(userBalls, computerBalls);
    }

    private void judgeBallsAndStrike(Balls userBalls, Balls computerBalls) {
        for (int i = 0; i < Balls.BALLS_LENGTH; i++) {
            if (userBalls.contains(computerBalls.get(i))) {
                JudgeResult.BALL.plusCount();
            }
        }
        judgeStrike(userBalls, computerBalls);
        JudgeResult.BALL.setBall();
    }

    private void judgeStrike(Balls userBalls, Balls computerBalls) {
        for (int i = 0; i < Balls.BALLS_LENGTH; i++) {
            if (userBalls.get(i).equals(computerBalls.get(i))) {
                JudgeResult.STRIKE.plusCount();
            }
        }
    }
}
