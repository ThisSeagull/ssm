package dao;

import entity.Orders;

import java.util.List;

public interface OrderMapper{
    List<Orders> listAllOrders();
}
