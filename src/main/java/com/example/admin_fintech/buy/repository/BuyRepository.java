package com.example.admin_fintech.buy.repository;

import com.example.admin_fintech.buy.dto.Buy;
import com.example.admin_fintech.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BuyRepository {
    @Autowired
    BuyMapper mapper;

    public ArrayList<Buy> SelectBuy(){
        return mapper.SelectBuy();
    }
}
