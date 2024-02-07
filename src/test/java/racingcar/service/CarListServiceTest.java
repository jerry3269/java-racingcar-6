package racingcar.service;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class CarListServiceTest {

    @Test
    void toCarList_StringList를_입력하면_CarList로_반환합니다(){
        //given
        List<String> stringList = new ArrayList<>();
        stringList.add("car");

        //when
        List<Car> carList = CarListService.toCarList(stringList);

        //then
        assertThat(carList.get(0).getName()).isEqualTo("car");
    }

    @Test
    void getWinners_winnersList를_입력하면_우승자를_StringList로_반환합니다(){
        //given
        Car car1 = Car.valueOf("car1");
        Car car2 = Car.valueOf("car2");
        Car car3 = Car.valueOf("car3");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        //when
        List<String> winners = CarListService.getWinners(cars);


        //then
        assertThat(winners).contains("car1", "car2", "car3");
    }

}