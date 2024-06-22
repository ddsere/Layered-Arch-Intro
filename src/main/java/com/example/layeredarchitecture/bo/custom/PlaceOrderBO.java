package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface PlaceOrderBO extends SuperBO {
    public String generateNewId() throws SQLException, ClassNotFoundException;

    public boolean exist(String orderId) throws SQLException, ClassNotFoundException;

    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException;

    public boolean save(OrderDetailDTO orderDetails ) throws SQLException, ClassNotFoundException;
}
