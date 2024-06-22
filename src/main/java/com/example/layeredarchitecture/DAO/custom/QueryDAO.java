package com.example.layeredarchitecture.DAO.custom;

import com.example.layeredarchitecture.DAO.SuperDAO;

public interface QueryDAO extends SuperDAO {
    void getOrdersByCustomerName();
}
