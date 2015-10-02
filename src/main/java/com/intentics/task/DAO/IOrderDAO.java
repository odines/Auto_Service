package com.intentics.task.DAO;

import com.intentics.task.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDAO extends JpaRepository<Order, Integer> {
}
