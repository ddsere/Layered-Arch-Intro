package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.DAO.custom.QueryDAO;
import com.example.layeredarchitecture.DAO.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getDAOFactory(){
        return (daoFactory==null)? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DTOType{
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL, QUERY
    }

    public SuperDAO getDAO(DTOType type){
        switch (type){
            case CUSTOMER:
                return new CustomerDAOImpl();

            case ITEM:
                return new ItemDAOImpl();

            case ORDER:
                return new OrderDAOImpl();

            case ORDER_DETAIL:
                return new OrderDetailDAOImpl();

            case QUERY:
                return new QueryDAOimpl();
        }
        return null;
    }
}