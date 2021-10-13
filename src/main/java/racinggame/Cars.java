package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private final List<Car> racingCar;
    public Cars(String input) {
        this.racingCar = registerCar(input);
    }

    private List<Car> registerCar(String input) {
        List<String> inputCars = Arrays.asList(input.trim().split("\\s*,\\s*"));
        List<Car> racingCar = new ArrayList<>();
        for (String carName : inputCars) {
            racingCar.add(new Car(carName));
        }
        return racingCar;
    }

    public List<Car> getRacingCar(){
        return racingCar;
    }

    public void runTrack(int lap) {
        for (Car car : racingCar) {
            car.lapRecord(lap);
        }
    }
}
