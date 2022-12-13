package com.example.admin_fintech.buy.service;


import com.example.admin_fintech.buy.dto.Buy;
import com.example.admin_fintech.buy.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BuyService {

    @Autowired
    BuyRepository br;

    public ArrayList<Buy> SelectBuy(){
        return br.SelectBuy();
    }
}
