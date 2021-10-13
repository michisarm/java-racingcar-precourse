package racinggame;

public enum ExceptionMessage {
    CAR_NAME_NULL("[ERROR] 차량 이름을 다시 입력해주세요"),
    CAR_NAME_LENTH("[ERROR] 이름은 5글자만 입력 할 수 있습니다."),;

    final private String message;
    ExceptionMessage(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
