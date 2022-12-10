package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JudgeTest {

    @DisplayName("All스트라이크시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validateAllStrike() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("123");
        new Judge(computerBalls, userBalls);

        assertThat(JudgeResult.STRIKE.getCount())
                .isEqualTo(JudgeResult.STRIKE.getGoal());
        assertThat(JudgeResult.BALL.getCount())
                .isEqualTo(JudgeResult.BALL.getGoal());
    }

    @DisplayName("AllBall시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validateAllBall() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("312");
        new Judge(computerBalls, userBalls);

        assertThat(JudgeResult.STRIKE.getCount())
                .isEqualTo(0);
        assertThat(JudgeResult.BALL.getCount())
                .isEqualTo(3);
    }

    @DisplayName("2Ball 1Strike시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validate2Ball1Strike() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("213");
        new Judge(computerBalls, userBalls);

        assertThat(JudgeResult.STRIKE.getCount())
                .isEqualTo(1);
        assertThat(JudgeResult.BALL.getCount())
                .isEqualTo(2);
    }

    @DisplayName("낫싱시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validateNothing() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("456");
        new Judge(computerBalls, userBalls);

        assertThat(JudgeResult.STRIKE.getCount())
                .isEqualTo(0);
        assertThat(JudgeResult.BALL.getCount())
                .isEqualTo(0);
    }


}