package com.practice.demo.service;

import com.practice.demo.entities.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderListImp implements OrderListService  {
    List<Order> list=null;
    public OrderListImp(){
        list = new ArrayList<>();
        list.add(new Order(1200, "This is very useful product for hair", 100.00F, "Hair oil"));
        list.add(new Order(1300, "This is very useful product", 3000.00F, "Face cream"));
    }

    @Override
    public List<Order> getOrderList(){
        return list;
    }
    @Override
    public Order getOderById(Integer orderId){
        Order or = null;
        for(Order order : list){
            if(order.getOrderId().equals(orderId)){
                return order;
            }
        }
        return or;
    }

    @Override
    public Order addOrder(Order order){
        list.add(order);
        return order;
    }
}
