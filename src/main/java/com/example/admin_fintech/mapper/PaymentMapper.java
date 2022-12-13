package com.example.admin_fintech.mapper;

import com.example.admin_fintech.payment.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PaymentMapper {
    public ArrayList<Payment> SelectPayment();
}
