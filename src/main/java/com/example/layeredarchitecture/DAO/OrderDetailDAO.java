package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderDetailDAO {
    public boolean saveOrderDetails(List<OrderDetailDTO> orderDetails, String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrderDetail(OrderDetailDTO orderDetails ,String orderId) throws SQLException, ClassNotFoundException;
}
