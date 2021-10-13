package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("여러대의 자동자를 생성한다")
    void makeCars(){
        String input = "son, paca, july";
        Cars cars = new Cars(input);

        // 생성된 자동차 확인
        List<String> inputCars = Arrays.asList(input.trim().split("\\s*,\\s*"));
        for (Car car : cars.getRegisterCar()) {
            assertThat(inputCars.contains(car.getName())).isTrue();
        }
    }
}
