package racingcar.service;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarListService {
    private final RandomNumberCreator randomNumberCreator;

    public CarListService(RandomNumberCreator randomNumberCreator) {
        this.randomNumberCreator = randomNumberCreator;
    }

    public List<Car> toCarList(List<String> stringList) {
        return stringList.stream()
                .map(Car::valueOf)
                .collect(Collectors.toList());
    }

    public void moveCars(List<Car> cars) {
        for (Car car : cars) {
            car.move(randomNumberCreator.createNumber());
        }
    }
}
