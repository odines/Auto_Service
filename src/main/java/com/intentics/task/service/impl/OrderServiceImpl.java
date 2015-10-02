package com.intentics.task.service.impl;

import com.intentics.task.DAO.IOrderDAO;
import com.intentics.task.domain.Order;
import com.intentics.task.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDAO orderDAO;

    @Override
    public Order addOrder(Order order) {
        Order savedOrder = orderDAO.saveAndFlush(order);
        return savedOrder;
    }

    @Override
    public void deleteOrder(Integer id) {

        orderDAO.delete(id);

    }

    @Override
    public Order editOrder(Order order) {
        return orderDAO.saveAndFlush(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderDAO.findAll();
    }
}
