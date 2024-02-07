package racingcar.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberCreatorTest {

    @Test
    void createNumber_0에서_9사이의_숫자를_반환합니다(){
        //given
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

        //when
        int createNumber = randomNumberCreator.createNumber();

        //then
        assertThat(createNumber).isGreaterThan(0);
        assertThat(createNumber).isLessThan(9);
    }
}
