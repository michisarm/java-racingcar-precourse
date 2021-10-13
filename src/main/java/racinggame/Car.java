package racinggame;

public class Car {
    private CarName carName;

    public Car(String name) {
        this.carName = new CarName(name);
    }

    public String getName() {
        return carName.getName();
    }
}
