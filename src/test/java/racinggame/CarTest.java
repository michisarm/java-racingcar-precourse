package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차 생성시 이름 입력")
    void createCar(){
        String input = "tom";
        Car tomCar = new Car(input);
        assertThat(tomCar.getName()).isEqualTo(input);

        // 5글자 입력 초과시 Exception
        boolean thrown = false;
        try {
            input = "brandon";
            Car brandonCar = new Car(input);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertThat(thrown).isTrue();
    }
}
