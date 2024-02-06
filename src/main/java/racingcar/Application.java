package racingcar;

import racingcar.controller.RacingManager;
import racingcar.view.input.InputView;
import racingcar.view.output.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingManager racingManager = new RacingManager(
                new InputView(),
                new OutputView()
        );

        racingManager.start();
    }
}
