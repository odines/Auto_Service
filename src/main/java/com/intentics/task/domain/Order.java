package com.intentics.task.domain;

import com.intentics.task.domain.enums.OrderStatusEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    private Integer id;
    private String amount;
    private OrderStatusEnum status;
    private Car car;

    Order() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    public OrderStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_car", nullable = false)
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
