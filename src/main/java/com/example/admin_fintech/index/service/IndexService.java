package com.example.admin_fintech.index.service;

import com.example.admin_fintech.index.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    @Autowired
    IndexRepository ir;

    public int CntMember(){
        return ir.CntMember();
    }

    public double AmountPayment(){
        return ir.AmountPayment();
    }

    public int CntBuy(){
        return ir.CntBuy();
    }

    public int CntContact(){
        return ir.CntContact();
    }


}
