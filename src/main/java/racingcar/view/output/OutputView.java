package racingcar.view.output;

import static racingcar.constant.MessageConstant.CAR_NAME_INPUT_MESSAGE;
import static racingcar.constant.MessageConstant.TRIAL_COUNT_INPUT_MESSAGE;

public class OutputView {
    public void carNameInputMessage() {
        System.out.println(CAR_NAME_INPUT_MESSAGE.message());
    }

    public void trialCountInputMessage() {
        System.out.println(TRIAL_COUNT_INPUT_MESSAGE.message());
    }
}
