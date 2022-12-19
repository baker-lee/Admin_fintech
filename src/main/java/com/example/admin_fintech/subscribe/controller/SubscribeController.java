package com.example.admin_fintech.subscribe.controller;

import com.example.admin_fintech.subscribe.dto.Subscribe;
import com.example.admin_fintech.subscribe.service.SubscribeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "구독 요청 목록", description = "구독 요청 목록 관련 서비스")

@RestController
public class SubscribeController {

    @Autowired
    SubscribeService ss;

    @ApiOperation(value = "구독요청목록", notes = "구독 요청 목록을 불러오는 API입니다.")

    @GetMapping("/selectSubscribe")
    public ArrayList<Subscribe> SelectSubscribe(){
        return ss.SelectSubscribe();
    }
}
