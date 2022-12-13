package com.example.admin_fintech.payment.service;

import com.example.admin_fintech.payment.dto.Payment;
import com.example.admin_fintech.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository pr;

    public ArrayList<Payment> SelectPayment(){
        return pr.SelectPayment();
    }
}
