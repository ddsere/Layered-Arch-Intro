package com.example.layeredarchitecture.DAO.custom.impl;

import com.example.layeredarchitecture.DAO.custom.ItemDAO;
import com.example.layeredarchitecture.DAO.sqlUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public ArrayList<ItemDTO> loadAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT * FROM Item");

        ArrayList<ItemDTO> itemDTOS = new ArrayList<>();
        while (rst.next()) {
            ItemDTO itemDTO = new ItemDTO(
                    rst.getString("code"),
                    rst.getString("description"),
                    rst.getBigDecimal("unitPrice"),
                    rst.getInt("qtyOnhand")
            );
            itemDTOS.add(itemDTO);
        }
        return itemDTOS;
    }

    @Override
    public void delete(String code) throws SQLException, ClassNotFoundException {
        sqlUtil.execute("DELETE FROM Item WHERE code=?", code);
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return sqlUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",dto.getCode(),dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand());
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return sqlUtil.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand(),dto.getCode());
    }

    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT code FROM Item WHERE code=?",code);
        return rst.next();
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("code");
            int newItemId = Integer.parseInt(id.replace("I00-", "")) + 1;
            return String.format("I00-%03d", newItemId);
        } else {
            return "I00-001";
        }
    }

    @Override
    public ItemDTO searchAll(String newItemCode) throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT * FROM Item WHERE code=?", newItemCode + "");
        rst.next();

        ItemDTO itemDTO;
        itemDTO = new ItemDTO(
                rst.getString("code"),
                rst.getString("description"),
                rst.getBigDecimal("unitPrice"),
                rst.getInt("qtyOnHand")
        );
        return itemDTO;
    }
}
