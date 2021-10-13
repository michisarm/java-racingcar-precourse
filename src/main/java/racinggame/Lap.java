package racinggame;

import nextstep.utils.Randoms;

public class Lap {
    private static int MIN_NUMBER = 0;
    private static int MAX_NUMBER = 9;
    private static int FORWARD_NUMBER = 4;

    private int lap;
    private DrivingDistance drivingDistance;

    public Lap(int lap) {
        this.lap = lap;
        this.drivingDistance = createDrivingDistance();
    }

    public DrivingDistance createDrivingDistance(){
        // 4이상일 경우 전진, 3이하의 값이면 멈춤
        if(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= FORWARD_NUMBER){
            return DrivingDistance.FORWARD;
        }
        return DrivingDistance.STOP;
    }

    public DrivingDistance getDrivingDistance() {
        return drivingDistance;
    }
}
