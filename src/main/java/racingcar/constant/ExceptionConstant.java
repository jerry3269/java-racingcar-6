package racingcar.constant;

public enum ExceptionConstant {
    FIVE_OVER_EXCEPTION("[예외처리] 5자리 이하의 이름만 입력해 주세요"),
    BLANK_EXCEPTION("[예외처리] 빈 값은 자동차 이름이 될 수 없습니다."),
    CAR_NAME_DUPLICATION_EXCEPTION("[예외처리] 차 이름은 중복될 수 없습니다.");

    private String message;

    ExceptionConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
