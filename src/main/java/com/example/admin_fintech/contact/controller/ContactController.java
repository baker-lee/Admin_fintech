package com.example.admin_fintech.contact.controller;

import com.example.admin_fintech.contact.dto.Contact;
import com.example.admin_fintech.contact.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = {"연락 요청 목록"}, description = "연락 요청 목록 관련 서비스")
@RestController
public class ContactController {

    @Autowired
    ContactService cs;

    @ApiOperation(value = "연락 요청 목록", notes = "연락 요청 한 목록을 불러오는 API입니다.")
    @GetMapping("/selectContact")
    public ArrayList<Contact> SelectContact(){
        return cs.SelectContact();
    }
}
