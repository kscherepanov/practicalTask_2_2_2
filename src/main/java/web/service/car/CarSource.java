package web.service.car;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarSource {
    private static final int MAX_COUNT_VALUE = 5;

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Audi", "A3", "black"));
        cars.add(new Car("Hyundai", "Sonata", "black"));
        cars.add(new Car("Mercedes-Benz", "CLS", "black"));
        cars.add(new Car("Skoda", "Superb", "black"));
        cars.add(new Car("BMW", "M2", "black"));
        cars.add(new Car("Kia", "K900", "black"));
        cars.add(new Car("Mitsubishi", "ASX", "black"));
    }

    public static List<Car> getCars(Integer count)
    {
        if (count == null || count >= MAX_COUNT_VALUE) {
            return cars;
        }

        return cars
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
