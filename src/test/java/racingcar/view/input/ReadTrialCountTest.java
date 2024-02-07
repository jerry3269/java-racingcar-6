package racingcar.view.input;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.view.input.validator.InputViewValidator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ReadTrialCountTest extends NsTest {
    private int trialCount;

    @Test
    void 빈칸이_들어오면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자가_아닌_값이_들어오면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run("abc123"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> run("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자가_1보다_작은_값이_들어오면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 정상적인_시도_횟수가_입력되면_성공적으로_반환한다(){
        run("15");
        assertThat(trialCount).isEqualTo(15);
    }

    @Override
    protected void runMain() {
        InputView inputView = new InputView(new InputViewValidator());
        trialCount = inputView.readTrialCount();
    }
}
