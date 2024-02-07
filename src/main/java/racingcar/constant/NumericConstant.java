package racingcar.constant;

public enum NumericConstant {
    MIN_RANDOM_NUMBER(0),
    MAX_RANDOM_NUMBER(9),
    MIN_MOVE_NUMBER(4);

    private int value;

    NumericConstant(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
