package racingcar;

import racingcar.controller.RacingManager;
import racingcar.service.CarListService;
import racingcar.service.RandomNumberCreator;
import racingcar.view.input.InputView;
import racingcar.view.input.validator.InputViewValidator;
import racingcar.view.output.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingManager racingManager = new RacingManager(
                new InputView(new InputViewValidator()),
                new OutputView(),
                new CarListService(new RandomNumberCreator())
        );

        racingManager.start();
    }
}
