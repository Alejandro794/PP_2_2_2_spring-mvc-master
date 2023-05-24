package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    {
    cars.add(new Car("BMW",4,"Germany"));
    cars.add(new Car("Renault",70,"France"));
    cars.add(new Car("Nissan",34,"Japan"));
    cars.add(new Car("Dodge",67,"USA"));
    cars.add(new Car("Toyota",200,"Japan"));
    }

    public List<Car> getCarsList() {
        return cars;
    }

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
