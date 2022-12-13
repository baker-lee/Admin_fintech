package com.example.admin_fintech.buy.controller;


import com.example.admin_fintech.buy.dto.Buy;
import com.example.admin_fintech.buy.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BuyController {

    @Autowired
    BuyService br;

    @GetMapping("/selectBuy")
    public ArrayList<Buy> SelectBuy(){
        return br.SelectBuy();
    }
}
