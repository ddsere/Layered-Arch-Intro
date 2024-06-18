package com.example.layeredarchitecture.DAO.custom;

import com.example.layeredarchitecture.DAO.CrudDAO;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderDetailDAO extends CrudDAO<OrderDetailDTO> {
    /*public boolean saveOrderDetail(OrderDetailDTO orderDetails, String orderId) throws SQLException, ClassNotFoundException;*/

}
