package racingcar.view.output;

import racingcar.domain.Car;

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
}
