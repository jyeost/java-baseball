package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallsTest {

    @DisplayName("범위의 맞지 않는 숫자나 문자 빈문자가 들어오면 제대로 에러가 나는지 확인한다")
    @ValueSource(strings = {"d", "0", "-1", "108", "", " ", "하하"})
    @ParameterizedTest
    void validateNotRange(String input) {
        assertThatThrownBy(() -> new Balls(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("중복된 숙자가 있을때 에러가 발생하는지 알아본다")
    @ValueSource(strings = {"112", "888"})
    @ParameterizedTest
    void validateDuplication(String input) {
        assertThatThrownBy(() -> new Balls(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}