package controller;

import model.Order;

import java.util.List;

public class OrderManager {

    private List<Order> orderList;

    public OrderManager(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void add(){
        orderList.add(new Order());
    }
    public void change(Order order){}
    public void delete(Order order){}

    public List<Order> getOrderList() {
        return orderList;
    }
}
