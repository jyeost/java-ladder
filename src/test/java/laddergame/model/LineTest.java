package laddergame.model;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import laddergame.model.Ladder.Line;

class LineTest {
    @Test
    @DisplayName("참여자의 개수보다 하나 적은 사이즈로 리스트 생성 테스트")
    void Should_Success_When_MakeLine() {
        int personCount = 4;
        assertThat(new Line(personCount).getNumber()).isEqualTo(personCount - 1);
    }

    @Test
    @DisplayName("리스트에 연속적으로 true가 포함될 경우 예외 발생")
    void Should_ThrowException_When_ContinueTrue() {
        assertThatThrownBy(() -> new Line(List.of(true, true)))
            .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}
