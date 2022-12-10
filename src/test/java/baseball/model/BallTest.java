package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class BallTest {

    @DisplayName("범위의 맞지 않는 숫자나 문자 빈문자가 들어오면 제대로 에러가 나는지 확인한다")
    @ValueSource(strings = {"d", "0", "-1", "10", "", " ", "하하"})
    @ParameterizedTest
    void validateNotRange(String input) {
        assertThatThrownBy(() -> new Ball(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("범위에 맞는 수를 입력 받으면 에러가 발생하지 않는다")
    @ValueSource(strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9"})
    @ParameterizedTest
    void validateInRange(String input) {
        assertThat(new Ball(input))
                .isNotInstanceOf(IllegalArgumentException.class);
    }

}