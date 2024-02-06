package racingcar.view.input.validator;

import java.util.Arrays;

import static racingcar.constant.ExceptionConstant.*;

public class InputViewValidator {
    public void check5Under(String[] cars) {
        for (String car : cars) {
            if(car.length() > 5) throw new IllegalArgumentException(FIVE_OVER_EXCEPTION.message());
        }
    }

    public void checkNotBlank(String[] cars) {
        for (String car : cars) {
            if(car.isBlank()) throw new IllegalArgumentException(BLANK_EXCEPTION.message());
        }
    }

    public void checkNotDuplication(String[] cars) {
        long count = cars.length;
        long distinctCount = Arrays.stream(cars).distinct().count();
        if (count != distinctCount) {
            throw new IllegalArgumentException(CAR_NAME_DUPLICATION_EXCEPTION.message());
        }
    }

    public void checkNumeric(String stringTrialCount) {
        try {
            Integer.parseInt(stringTrialCount);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NOT_NUMERIC_EXCEPTION.message());
        }
    }

    public void checkMoreThanOne(int trialCount) {
        if (trialCount < 1) {
            throw new IllegalArgumentException(LESS_THEN_ONE_EXCEPTION.message());
        }
    }
}
