package racinggame;

public class CarName {
    public static final int LIMIT_LENGTH = 5;
    private String name;

    public CarName(String name) {
        if(isBlank(name)){
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_NULL.getMessage());
        }
        if(name.length() > LIMIT_LENGTH){
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_LENTH.getMessage());
        }
        this.name = name;
    }

    public boolean isBlank(String str){
        if(str == null || str.trim().isEmpty()){
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

}
