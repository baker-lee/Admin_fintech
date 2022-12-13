package com.example.admin_fintech.index.controller;


import com.example.admin_fintech.index.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexService is;

    @GetMapping("/selectCntMember")
    public int CntMember(){
        return is.CntMember();
    }

    @GetMapping("/selectAmountPayment")
    public double AmountPayment(){
        return is.AmountPayment();
    }

    @GetMapping("/selectCntBuy")
    public int CntBuy(){
        return is.CntBuy();
    }

    @GetMapping("/selectCntContact")
    public int CntContact(){
        return is.CntContact();
    }

}
