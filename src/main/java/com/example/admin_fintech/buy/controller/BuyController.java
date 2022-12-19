package com.example.admin_fintech.buy.controller;


import com.example.admin_fintech.buy.dto.Buy;
import com.example.admin_fintech.buy.service.BuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = {"구매 목록"}, description = "구매 목록 관련 서비스")
@RestController
public class BuyController {

    @Autowired
    BuyService br;

    @ApiOperation(value = "구매 목록", notes = "회원이 코인을 구매 한 목록을 불러오는 API입니다.")
    @GetMapping("/selectBuy")
    public ArrayList<Buy> SelectBuy(){
        return br.SelectBuy();
    }
}
