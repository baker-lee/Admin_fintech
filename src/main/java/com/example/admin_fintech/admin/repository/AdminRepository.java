package com.example.admin_fintech.admin.repository;

import com.example.admin_fintech.admin.dto.AdminDto;
import com.example.admin_fintech.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper mapper;

    public AdminDto login(AdminDto adminDto){
        return mapper.login(adminDto);
    }
}
