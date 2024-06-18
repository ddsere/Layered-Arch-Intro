package com.example.layeredarchitecture.DAO.custom.impl;

import com.example.layeredarchitecture.DAO.custom.OrderDAO;
import com.example.layeredarchitecture.DAO.sqlUtil;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace(
                "OID-", "")) + 1)) : "OID-001";
    }

    @Override
    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {
        return sqlUtil.execute("SELECT oid FROM `Orders` WHERE oid=?", orderId);
    }

    @Override
    public OrderDTO searchAll(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<OrderDTO> loadAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        //OrderDTO dto = new OrderDTO(orderId,orderDate,customerId);
        return sqlUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",dto.getOrderId(), dto.getOrderDate(), dto.getCustomerId());
        //return rst.next();
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {

    }
}
