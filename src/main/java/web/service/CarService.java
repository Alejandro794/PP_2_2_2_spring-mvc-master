package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsList();
    List<Car> getCars(List<Car> cars, int count);
}
