package com.example.admin_fintech.mapper;


import com.example.admin_fintech.subscribe.dto.Subscribe;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface SubscribeMapper {
    public ArrayList<Subscribe> SelectSubscribe();
}
