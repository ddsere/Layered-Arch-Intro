package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.DAO.DAOFactory;
import com.example.layeredarchitecture.DAO.custom.OrderDAO;
import com.example.layeredarchitecture.DAO.custom.OrderDetailDAO;
import com.example.layeredarchitecture.DAO.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.DAO.custom.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.bo.custom.PlaceOrderBO;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class PlaceOrderBOImpl implements PlaceOrderBO {
    OrderDAO orderDAO = (OrderDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DTOType.ORDER);
    OrderDetailDAO orderDetailDAO = (OrderDetailDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DTOType.ORDER_DETAIL);

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return orderDAO.generateNewId();
    }

    @Override
    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(orderId);
    }

    @Override
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.save(dto);
    }

    @Override
    public boolean save(OrderDetailDTO orderDetails) throws SQLException, ClassNotFoundException {
        return orderDetailDAO.save(orderDetails);
    }
}
