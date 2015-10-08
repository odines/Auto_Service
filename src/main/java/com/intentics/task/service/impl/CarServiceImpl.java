package com.intentics.task.service.impl;

import com.intentics.task.DAO.ICarDAO;
import com.intentics.task.domain.Car;
import com.intentics.task.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    private ICarDAO carDAO;

    @Override
    public Car addCar(Car car) {

        return carDAO.saveAndFlush(car);
    }

    @Override
    public void deleteCar(Integer id) {

        carDAO.delete(id);

    }

    @Override
    public Car editCar(Car car) {

        return carDAO.saveAndFlush(car);

    }

    @Override
    public List<Car> getAll() {
        return carDAO.findAll();
    }

    @Override
    public Car getCarById(Integer id) {
        return carDAO.findOne(id);
    }


}
