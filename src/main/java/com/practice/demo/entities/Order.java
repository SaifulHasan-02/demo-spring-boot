package com.practice.demo.entities;

public class Order {
    private Integer orderId;
    private String description;
    private Float price;
    private String product;

    public  Order(){

    }

    public Order(Integer orderId, String description, Float price, String product) {
        this.orderId = orderId;
        this.description = description;
        this.price = price;
        this.product = product;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", product='" + product + '\'' +
                '}';
    }
}
