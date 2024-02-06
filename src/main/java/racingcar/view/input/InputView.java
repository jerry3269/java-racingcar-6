package racingcar.view.input;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public List<String> readCarName() {
        String[] cars = Console.readLine().split(",");
        return Arrays.asList(cars);
    }
}
