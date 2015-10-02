package com.intentics.task.DAO;

import com.intentics.task.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICarDAO extends JpaRepository<Car, Integer> {

}
