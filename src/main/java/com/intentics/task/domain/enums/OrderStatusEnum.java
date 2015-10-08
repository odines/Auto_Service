package com.intentics.task.domain.enums;

public  enum OrderStatusEnum {

    COMPLETED("Completed"),
    IN_PROGRESS("In Progress"),
    CANCELLED("Cancelled");

    private String description;

    OrderStatusEnum(String description){
        this.description = description;
    }

     public String getDescription(){
        return description;
    }
}
