package racingcar.domain;

import static racingcar.constant.NumericConstant.MIN_MOVE_NUMBER;

public class Car {
    private String name;
    private int moveCount;

    private Car(String name) {
        this.name = name;
    }

    public static Car valueOf(String name) {
        return new Car(name);
    }

    public void move(int randomNumber) {
        if(randomNumber >= MIN_MOVE_NUMBER.value()) moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(name)
                .append(" : ");

        for (int i = 0; i < moveCount; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
