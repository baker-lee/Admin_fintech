package com.example.admin_fintech.index.controller;


import com.example.admin_fintech.index.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"메인 페이지"}, description = "메인 페이지 서비스")
@RestController
public class IndexController {

    @Autowired
    IndexService is;

    @ApiOperation(value = "회원 수", notes = "전체 회원 수를 불러오는 API입니다.")
    @GetMapping("/selectCntMember")
    public int CntMember(){
        return is.CntMember();
    }

    @ApiOperation(value = "총 결제 금액", notes = "전체 회원의 총 결제 금액을 불러오는 API입니다.")
    @GetMapping("/selectAmountPayment")
    public double AmountPayment(){
        return is.AmountPayment();
    }

    @ApiOperation(value = "코인 구매 건수", notes = "전체 코인 구매 수의 합을 불러오는 API입니다.")
    @GetMapping("/selectCntBuy")
    public int CntBuy(){
        return is.CntBuy();
    }

    @ApiOperation(value = "연락 요청 건수", notes = "전체 연락 요청 건수를 불러오는 API입니다.")
    @GetMapping("/selectCntContact")
    public int CntContact(){
        return is.CntContact();
    }


}
