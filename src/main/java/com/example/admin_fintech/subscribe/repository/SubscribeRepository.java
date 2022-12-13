package com.example.admin_fintech.subscribe.repository;

import com.example.admin_fintech.mapper.SubscribeMapper;
import com.example.admin_fintech.subscribe.dto.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public ArrayList<Subscribe> SelectSubscribe(){
        return mapper.SelectSubscribe();
    }
}
