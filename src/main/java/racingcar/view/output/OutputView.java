package racingcar.view.output;

import racingcar.domain.Car;

import java.util.List;

import static racingcar.constant.MessageConstant.*;

public class OutputView {
    public void carNameInputMessage() {
        System.out.println(CAR_NAME_INPUT_MESSAGE.message());
    }

    public void trialCountInputMessage() {
        System.out.println(TRIAL_COUNT_INPUT_MESSAGE.message());
    }

    public void printNewLine() {
        System.out.println();
    }

    public void printMoveResultMessage() {
        System.out.println(MOVE_RESULT_MESSAGE.message());
    }

    public void moveResultMessage(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
