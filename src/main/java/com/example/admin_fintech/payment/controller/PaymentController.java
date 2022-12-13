package com.example.admin_fintech.payment.controller;

import com.example.admin_fintech.payment.dto.Payment;
import com.example.admin_fintech.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PaymentController {

    @Autowired
    PaymentService ps;

    @GetMapping("/selectPayment")
    public ArrayList<Payment> SelectPayment(){
        return ps.SelectPayment();
    }
}
