package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    String inputLapCount;
    String inputRacingCar;
    Cars cars;
    RacingGame racingGame;

    @BeforeEach
    void setup(){
        inputLapCount = "5";
        inputRacingCar = "son, paca, july";
        cars = new Cars(inputRacingCar);
        racingGame = new RacingGame(inputLapCount, cars);
    }
    @Test
    @DisplayName("경주 게임 등록")
    void createRacingGame(){
        racingGame = new RacingGame(inputLapCount, cars);

        // 경주 횟수 테스트
        assertThat(racingGame.getRacingCount()).isEqualTo(inputLapCount);

        // 경주 등록된 Car 테스트
        String racingCar = racingGame.getRacingCars().getRacingCar().stream().map(Car::getName).collect(Collectors.joining(","));
        assertThat(racingCar).isEqualTo(inputRacingCar.replaceAll("\\s", ""));
    }

    @Test
    @DisplayName("자동차 경주 RUN 후 lap 기록 확인")
    void runRacingGame(){
        racingGame.startGame();
        for (Car car : racingGame.getRacingCars().getRacingCar()) {
            assertThat(car.getLap(0).getDrivingDistance()).isExactlyInstanceOf(DrivingDistance.class);
        }
    }

    @Test
    @DisplayName("자동차 경주 완료 후 자동차 기록 확인")
    void endRacingGame(){
        racingGame.startGame();
        if(racingGame.isEndGame()){
            racingGame.showGameResult();
            racingGame.showWinnerCars();
        }
    }
}
