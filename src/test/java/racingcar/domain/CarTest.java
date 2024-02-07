package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void move_4_이상의_값이_들어오면_moveCount를_1_증가시킨다(){
        //given
        Car car = Car.valueOf("car");

        //when
        car.move(4);

        //then
        assertThat(car.getMoveCount()).isEqualTo(1);
    }

    @Test
    void move_4_보다_작은_값이_들어오면_moveCount는_그대로다(){
        //given
        Car car = Car.valueOf("car");

        //when
        car.move(0);
        car.move(1);
        car.move(2);
        car.move(3);

        //then
        assertThat(car.getMoveCount()).isEqualTo(0);
    }

    @Test
    void toString_주어진_형식에_맞게_toString을_반환하는지_검사한다(){
        //given
        Car car = Car.valueOf("car");
        car.move(0);
        car.move(4);
        car.move(5);
        car.move(6);

        //when
        String string = car.toString();

        //then
        assertThat(string).isEqualTo("car : ---");
    }
}