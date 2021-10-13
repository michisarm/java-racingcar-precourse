package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LapTest {
    @Test
    @DisplayName("전진 조건 테스트")
    void lapTest(){
        Lap lap = new Lap(1);
        assertThat(lap.getDrivingDistance()).isExactlyInstanceOf(DrivingDistance.class);
    }
}
