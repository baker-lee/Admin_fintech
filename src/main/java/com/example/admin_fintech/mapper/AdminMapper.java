package com.example.admin_fintech.mapper;

import com.example.admin_fintech.admin.dto.AdminDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface AdminMapper {

    public AdminDto login(AdminDto adminDto);
}
