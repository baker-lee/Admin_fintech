package com.example.admin_fintech.member.controller;

import com.example.admin_fintech.member.dto.Member;
import com.example.admin_fintech.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MemberController {

    @Autowired
    MemberService ms;

    @GetMapping("/selectMember")
    public ArrayList<Member> SelectMember(){
        return ms.SelectMember();
    }
}
