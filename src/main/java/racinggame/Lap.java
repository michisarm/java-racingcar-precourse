package racinggame;

public class Lap {
    private int lap;
    private String drivingDistance;

    public Lap(int lap, String drivingDistance) {
        this.lap = lap;
        this.drivingDistance = drivingDistance;
    }

    public String getDrivingDistance() {
        return drivingDistance;
    }
}
