package com.example.admin_fintech.subscribe.service;

import com.example.admin_fintech.subscribe.dto.Subscribe;
import com.example.admin_fintech.subscribe.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository sr;

    public ArrayList<Subscribe> SelectSubscribe(){
        return sr.SelectSubscribe();
    }
}
