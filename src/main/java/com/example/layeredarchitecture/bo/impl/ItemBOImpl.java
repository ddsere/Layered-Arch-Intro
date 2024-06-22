package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.DAO.DAOFactory;
import com.example.layeredarchitecture.DAO.custom.ItemDAO;
import com.example.layeredarchitecture.DAO.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.bo.custom.ItemBO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DTOType.ITEM);
    public ArrayList<ItemDTO> loadAll() throws SQLException, ClassNotFoundException {
        return itemDAO.loadAll();
    }

    public void delete(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    public String generateNewId() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewId();
    }

    public ItemDTO searchAll(String newItemCode) throws SQLException, ClassNotFoundException {
        return itemDAO.searchAll(newItemCode);
    }
}
