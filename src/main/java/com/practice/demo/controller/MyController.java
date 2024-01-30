package com.practice.demo.controller;
import com.practice.demo.entities.Order;
import com.practice.demo.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private OrderListService orderListService;
    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "My world";
    }
    @RequestMapping("/order")
    @ResponseBody
    public List<Order> getOrderlist(){
       return orderListService.getOrderList();
    }
    @RequestMapping("/order/{orderId}")
    @ResponseBody
    public ResponseEntity<HttpStatus> getOrderById(@PathVariable String orderId){
        try{
            this.orderListService.getOderById(Integer.parseInt(orderId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/order")
    @ResponseBody
    public Order addOrder(@RequestBody Order order){
        return orderListService.addOrder(order);
    }
}
