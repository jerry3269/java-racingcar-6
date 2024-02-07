package racingcar;

import racingcar.config.RacingManagerBuilder;
import racingcar.controller.RacingManager;

public class Application {
    public static void main(String[] args) {
        RacingManagerBuilder racingManagerBuilder = new RacingManagerBuilder();
        RacingManager racingManager = racingManagerBuilder.getRacingManager();
        racingManager.start();
    }
}
