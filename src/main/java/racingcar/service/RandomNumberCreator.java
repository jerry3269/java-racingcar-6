package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constant.NumericConstant.MAX_RANDOM_NUMBER;
import static racingcar.constant.NumericConstant.MIN_RANDOM_NUMBER;

public class RandomNumberCreator {
    public int createNumber() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER.value(), MAX_RANDOM_NUMBER.value());
    }
}
