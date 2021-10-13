package racinggame;

public class CarName {
    public static final int LIMIT_LENGTH = 5;
    private String name;

    public CarName(String name) {
        if(name.length() > LIMIT_LENGTH){
            throw new IllegalArgumentException("[ERROR] 이름은 5글자만 입력 할 수 있습니다.");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
