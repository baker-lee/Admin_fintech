package com.example.admin_fintech.payment.repository;

import com.example.admin_fintech.mapper.MemberMapper;
import com.example.admin_fintech.mapper.PaymentMapper;
import com.example.admin_fintech.member.dto.Member;
import com.example.admin_fintech.payment.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;


    public ArrayList<Payment> SelectPayment(){
        return mapper.SelectPayment();
    }
}
