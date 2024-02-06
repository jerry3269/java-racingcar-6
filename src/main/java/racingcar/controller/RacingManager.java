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
    }

    private List<String> getCarNameByInput() {
        outputView.carNameInputMessage();
        return inputView.readCarName();
    }
}
