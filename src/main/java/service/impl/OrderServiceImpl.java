package service.impl;

import dao.OrderMapper;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderDao;
    @Override
    public List<Orders> listAllOrders() {
        return orderDao.listAllOrders();
    }
}
