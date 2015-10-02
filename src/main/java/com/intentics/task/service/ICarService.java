package com.intentics.task.service;

import com.intentics.task.domain.Car;

import java.util.List;

public interface ICarService {

    Car addCar(Car car);
    void deleteCar(Integer id);
    Car editCar(Car car);
    List<Car> getAll();
}
