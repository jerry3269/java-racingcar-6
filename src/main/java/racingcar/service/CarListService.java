package racingcar.service;

import racingcar.domain.Car;

import java.util.Comparator;
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

    public List<String> getWinners(List<Car> cars) {
        Integer max = cars.stream()
                .max(Comparator.comparing(Car::getMoveCount))
                .map(Car::getMoveCount)
                .orElseThrow();

        return cars.stream()
                .filter(c -> c.getMoveCount() == max)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
