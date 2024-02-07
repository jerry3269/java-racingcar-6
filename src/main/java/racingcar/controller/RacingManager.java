package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.CarListService;
import racingcar.view.input.InputView;
import racingcar.view.output.OutputView;

import java.util.List;

public class RacingManager {
    private final InputView inputView;
    private final OutputView outputView;
    private final CarListService carListService;

    public RacingManager(
            InputView inputView,
            OutputView outputView,
            CarListService carListService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.carListService = carListService;
    }

    public void start() {
        List<String> carNameByInput = this.getCarNameByInput();
        int trialCount = this.getTrialCount();
        this.printMoveResultMessage();
        this.moveCars(carNameByInput, trialCount);
    }

    private List<String> getCarNameByInput() {
        outputView.carNameInputMessage();
        return inputView.readCarName();
    }

    private int getTrialCount() {
        outputView.trialCountInputMessage();
        return inputView.readTrialCount();
    }

    private void printMoveResultMessage() {
        outputView.printNewLine();
        outputView.printMoveResultMessage();
    }

    private void moveCars(List<String> carNameList, int trialCount) {
        List<Car> cars = carListService.toCarList(carNameList);

        for (int i = 0; i < trialCount; i++) {
            carListService.moveCars(cars);
            outputView.moveResultMessage(cars);
            outputView.printNewLine();
        }
    }
}
