package racingcar.view.input;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.view.input.validator.InputViewValidator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ReadCarNameTest extends NsTest {
    private List<String> carNames = new ArrayList<>();
    
    @Test
    void 빈칸이_들어오면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_다섯자리가_넘어가면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 중복된_이름이_들어오면_예외를_발생시킨다(){
        assertThatThrownBy(() -> run("abc,abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 정상적인_이름이_들어오면_성공적으로_저장한다(){
        run("a,b,c");
        assertThat(carNames).containsExactly("a", "b", "c");
    }

    @Override
    protected void runMain() {
        InputView inputView = new InputView(new InputViewValidator());
        carNames = inputView.readCarName();
    }
}
