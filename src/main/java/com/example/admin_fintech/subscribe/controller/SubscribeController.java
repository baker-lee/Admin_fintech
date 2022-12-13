package com.example.admin_fintech.subscribe.controller;

import com.example.admin_fintech.subscribe.dto.Subscribe;
import com.example.admin_fintech.subscribe.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SubscribeController {

    @Autowired
    SubscribeService ss;

    @GetMapping("/selectSubscribe")
    public ArrayList<Subscribe> SelectSubscribe(){
        return ss.SelectSubscribe();
    }
}
