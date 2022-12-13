package com.example.admin_fintech.admin.service;

import com.example.admin_fintech.admin.dto.AdminDto;
import com.example.admin_fintech.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository ar;

    public AdminDto login(AdminDto adminDto){
        return ar.login(adminDto);
    }
}
