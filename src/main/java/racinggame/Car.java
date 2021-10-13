package racinggame;

public class Car {
    private CarName carName;
    private LapRecords lapRecords;
    private int resultLap;

    public Car(String name) {
        this.carName = new CarName(name);
        lapRecords = new LapRecords();
    }

    public String getName() {
        return carName.getName();
    }

    public void lapRecord(int lap) {
        lapRecords.registerLapRecords(lap);
    }

    public Lap getLap(int lap){
        return lapRecords.getLapRecord(lap);
    }

    public String cumulativeLap(int lap){
        String cumulativeLap = "";
        for (int i = 0; i <= lap; i++){
            cumulativeLap += lapRecords.getLapRecord(i).getDrivingDistance().getRecord();
        }
        return cumulativeLap;
    }

    public void setResultLap(int resultLap) {
        this.resultLap = resultLap;
    }

    public boolean isResultLap(int lap){
        return resultLap == lap;
    }
}
