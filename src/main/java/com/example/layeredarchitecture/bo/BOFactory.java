package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.impl.ItemBOImpl;
import com.example.layeredarchitecture.bo.impl.PlaceOrderBOImpl;

import java.security.PublicKey;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType{
        CUSTOMER, ITEM, PLACE_ORDER
    }

    public SuperBO getBO(BOType boType){
        switch (boType){
            case CUSTOMER:
                return new CustomerBOImpl();

            case ITEM:
                return new ItemBOImpl();

            case PLACE_ORDER:
                return new PlaceOrderBOImpl();
        }
        return null;
    }
}
