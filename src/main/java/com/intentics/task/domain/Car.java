package com.intentics.task.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "cars")
public class Car implements Serializable {
    private Integer idCar;
    private String make;
    private String model;
    private Integer yearCar;
    private String vin;

    private Collection<Order> orders;


    private Client client;

    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCar")
    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    @NotNull
    @Size(min = 2, max = 30, message = "Length must be between 2 and 20")
    @Column(name = "make")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @NotNull
    @Size(min = 2, max = 30, message = "Length must be between 2 and 20")
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @NotNull(message = "length cannot be null")
    @Column(name = "yearCar")
    public Integer getYearCar() {
        return yearCar;
    }

    public void setYearCar(Integer yearCar) {
        this.yearCar = yearCar;
    }

    @Column(name = "vin")
    @Size(min = 5, max = 30, message = "Length must be between 5 and 30")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "car")
    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idClient", nullable = false)
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

