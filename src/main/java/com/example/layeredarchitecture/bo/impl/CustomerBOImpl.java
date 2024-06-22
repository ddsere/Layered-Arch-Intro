package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.DAO.DAOFactory;
import com.example.layeredarchitecture.DAO.custom.CustomerDAO;
import com.example.layeredarchitecture.DAO.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.bo.custom.CustomerBO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DTOType.CUSTOMER);
    public ArrayList<CustomerDTO> loadAll() throws SQLException, ClassNotFoundException {
        return customerDAO.loadAll();
    }

    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.save(dto);
    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }

    public String generateNewId() throws SQLException, ClassNotFoundException {
        return customerDAO.generateNewId();
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public CustomerDTO searchAll(String newValue) throws SQLException, ClassNotFoundException {
        return customerDAO.searchAll(newValue);
    }
}
