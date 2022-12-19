package com.example.admin_fintech.member.controller;

import com.example.admin_fintech.member.dto.Member;
import com.example.admin_fintech.member.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@Api(tags = {"회원 목록"}, description = "회원 목록 관련 서비스")
@RestController
public class MemberController {

    @Autowired
    MemberService ms;

    @ApiOperation(value = "회원 목록" , notes = "가입한 회원 목록을 불러오는 API입니다.")
    @GetMapping("/selectMember")
    public ArrayList<Member> SelectMember(){
        return ms.SelectMember();
    }
}
