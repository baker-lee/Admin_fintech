package com.example.admin_fintech.payment.controller;

import com.example.admin_fintech.payment.dto.Payment;
import com.example.admin_fintech.payment.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "결제 목록", description = "결제 목록 관련 서비스")
@RestController
public class PaymentController {

    @Autowired
    PaymentService ps;

    @ApiOperation(value = "결제 목록", notes = "회원이 결제 한 목록을 불러오는 API입니다.")
    @GetMapping("/selectPayment")
    public ArrayList<Payment> SelectPayment(){
        return ps.SelectPayment();
    }
}
