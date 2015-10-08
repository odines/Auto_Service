package com.intentics.task.service.impl;

import com.intentics.task.DAO.IOrderDAO;
import com.intentics.task.domain.Order;
import com.intentics.task.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Order getOrderById(Integer id) {
        return orderDAO.findOne(id);
    }
}
