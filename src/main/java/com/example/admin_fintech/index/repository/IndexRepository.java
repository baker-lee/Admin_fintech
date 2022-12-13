package com.example.admin_fintech.index.repository;


import com.example.admin_fintech.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexRepository {

    @Autowired
    IndexMapper mapper;

    public int CntMember(){
        return mapper.CntMember();
    }

    public double AmountPayment(){
        return mapper.AmountPayment();
    }

    public int CntBuy(){
        return mapper.CntBuy();
    }

    public int CntContact(){
        return mapper.CntContact();
    }

}
