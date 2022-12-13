package com.example.admin_fintech.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper {

    public int CntMember();

    public double AmountPayment();

    public int CntBuy();

    public int CntContact();
}
