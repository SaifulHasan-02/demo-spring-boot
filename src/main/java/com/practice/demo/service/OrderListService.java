package com.practice.demo.service;

import com.practice.demo.entities.Order;

import java.util.List;


public interface OrderListService {
    public List<Order> getOrderList();

    public Order getOderById(Integer orderId);
    public  Order addOrder(Order order);
}
