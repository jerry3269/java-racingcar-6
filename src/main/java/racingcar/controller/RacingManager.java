package racingcar.controller;

import racingcar.view.input.InputView;
import racingcar.view.output.OutputView;

import java.util.List;

public class RacingManager {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingManager(
            InputView inputView,
            OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        List<String> carNameByInput = this.getCarNameByInput();
        int trialCount = this.getTrialCount();
        this.printMoveResult();
    }

    private List<String> getCarNameByInput() {
        outputView.carNameInputMessage();
        return inputView.readCarName();
    }

    private int getTrialCount() {
        outputView.trialCountInputMessage();
        return inputView.readTrialCount();
    }

    private void printMoveResult() {
        outputView.printNewLine();
        outputView.printMoveResultMessage();
    }
}
