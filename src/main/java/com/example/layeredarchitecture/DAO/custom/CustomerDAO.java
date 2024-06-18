package com.example.layeredarchitecture.DAO.custom;

import com.example.layeredarchitecture.DAO.CrudDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
    /*public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException;

    public void saveCustomer(String id,String name,String address) throws SQLException, ClassNotFoundException;

    public void updateCustomer(String id,String name,String address) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    public CustomerDTO searchAllCustomers(String newValue) throws SQLException, ClassNotFoundException;*/
}
