package com.example.admin_fintech.member.service;

import com.example.admin_fintech.mapper.MemberMapper;
import com.example.admin_fintech.member.dto.Member;
import com.example.admin_fintech.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public ArrayList<Member> SelectMember(){
        return mr.SelectMember();
    }
}
