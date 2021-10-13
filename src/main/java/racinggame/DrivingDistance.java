package racinggame;

public enum DrivingDistance {
    STOP(""),
    FORWARD("-"),;

    final private String record;

    DrivingDistance(String record) {
        this.record = record;
    }

    public String getRecord(){
        return record;
    }

}
