package com.intentics.task.service;

import com.intentics.task.domain.Order;

import java.util.List;

public interface IOrderService {
    Order addOrder(Order order);

    void deleteOrder(Integer id);

    Order editOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(Integer id);
}
