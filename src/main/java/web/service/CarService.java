package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getAllCars() {
        Car car1 = new Car("BMW", "M5", 2020);
        Car car2 = new Car("AUDI", "R8", 2019);
        Car car3 = new Car("KIA", "RIO", 2017);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        return carList;
    }
}
