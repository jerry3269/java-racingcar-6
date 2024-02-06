package racingcar.constant;

public enum MessageConstant {
    CAR_NAME_INPUT_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    private String message;

    MessageConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
