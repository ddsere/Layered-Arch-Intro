package com.example.layeredarchitecture.DAO.custom;

import com.example.layeredarchitecture.DAO.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO extends CrudDAO<ItemDTO> {
    /*public ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;
    public void deleteItem(String code) throws SQLException, ClassNotFoundException;
    public void saveItems(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;
    public void updateItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;
    public boolean updateItems(List<OrderDetailDTO> orderDetails, ItemDTO item) throws SQLException, ClassNotFoundException;
    public boolean existIds(String code) throws SQLException, ClassNotFoundException;
    public String generateIds () throws SQLException, ClassNotFoundException;
    public ItemDTO searchItems(String newItemCode) throws SQLException, ClassNotFoundException;*/
}
