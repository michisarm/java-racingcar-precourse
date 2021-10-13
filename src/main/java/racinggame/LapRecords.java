package racinggame;

import java.util.ArrayList;
import java.util.List;

public class LapRecords {
    private final List<Lap> racingCar;

    public LapRecords() {
        this.racingCar = new ArrayList<>();
    }

    public void registerLapRecords(int lap){
        racingCar.add(new Lap(lap));
    }

    public Lap getLapRecord(int lap){
        return racingCar.get(lap);
    }
}
