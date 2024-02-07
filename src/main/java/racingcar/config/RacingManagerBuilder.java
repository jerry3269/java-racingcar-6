package racingcar.config;

import racingcar.controller.RacingManager;
import racingcar.service.CarListService;
import racingcar.service.RandomNumberCreator;
import racingcar.view.input.InputView;
import racingcar.view.input.validator.InputViewValidator;
import racingcar.view.output.OutputView;

public class RacingManagerBuilder {
    public RacingManager getRacingManager() {
        return new RacingManager(
                this.getInputView(),
                this.getOutputView(),
                this.getCarListService()
        );
    }

    private InputView getInputView() {
        return new InputView(this.getInputViewValidator());
    }

    private InputViewValidator getInputViewValidator() {
        return new InputViewValidator();
    }

    private OutputView getOutputView() {
        return new OutputView();
    }

    private CarListService getCarListService() {
        return new CarListService(this.getRandomNumberCreator());
    }

    private RandomNumberCreator getRandomNumberCreator() {
        return new RandomNumberCreator();
    }
}
