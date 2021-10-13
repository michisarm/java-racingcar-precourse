package racinggame;


public class Application {
    public static void main(String[] args) {
        String inputRacingCar = ConsoleView.readCar();
        Cars cars = new Cars(inputRacingCar);
        String inputLapCount = ConsoleView.readLap();
        RacingGame racingGame = new RacingGame(inputLapCount, cars);
        racingGame.startGame();
        if(racingGame.isEndGame()){
            racingGame.showGameResult();
            racingGame.showWinnerCars();
        }
    }
}
