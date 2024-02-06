package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.input.validator.InputViewValidator;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final InputViewValidator inputViewValidator;

    public InputView(InputViewValidator inputViewValidator) {
        this.inputViewValidator = inputViewValidator;
    }

    public List<String> readCarName() {
        String[] cars = Console.readLine().split(",");
        this.validateCarNames(cars);
        return Arrays.asList(cars);
    }

    private void validateCarNames(String[] cars) {
        inputViewValidator.checkNotBlank(cars);
        inputViewValidator.checkSizeLessThanFive(cars);
        inputViewValidator.checkNotDuplication(cars);
    }

    public int readTrialCount() {
        String stringTrialCount = Console.readLine();
        this.validateTrialCount(stringTrialCount);
        return Integer.parseInt(stringTrialCount);
    }

    private void validateTrialCount(String stringTrialCount) {
        inputViewValidator.checkNumeric(stringTrialCount);
        int trialCount = Integer.parseInt(stringTrialCount);
        inputViewValidator.checkMoreThanOne(trialCount);
    }
}
