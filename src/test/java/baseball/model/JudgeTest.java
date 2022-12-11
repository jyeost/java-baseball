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
        Judge judge = new Judge(computerBalls, userBalls);

        assertThat(judge.getStrikeResult())
                .isEqualTo(3);
        assertThat(judge.getBallResult())
                .isEqualTo(0);
    }

    @DisplayName("AllBall시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validateAllBall() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("312");
        Judge judge = new Judge(computerBalls, userBalls);

        assertThat(judge.getStrikeResult())
                .isEqualTo(0);
        assertThat(judge.getBallResult())
                .isEqualTo(3);
    }

    @DisplayName("2Ball 1Strike시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validate2Ball1Strike() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("213");
        Judge judge = new Judge(computerBalls, userBalls);

        assertThat(judge.getStrikeResult())
                .isEqualTo(1);
        assertThat(judge.getBallResult())
                .isEqualTo(2);
    }

    @DisplayName("낫싱시 스트라이크와 볼 개수가 JudgeResult에 제대로 입력되는지 알아본다")
    @Test
    void validateNothing() {
        Balls computerBalls = new Balls("123");
        Balls userBalls = new Balls("456");
        Judge judge = new Judge(computerBalls, userBalls);

        assertThat(judge.getStrikeResult())
                .isEqualTo(0);
        assertThat(judge.getBallResult())
                .isEqualTo(0);
    }


}