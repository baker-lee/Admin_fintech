package com.example.admin_fintech.member.repository;


import com.example.admin_fintech.mapper.MemberMapper;
import com.example.admin_fintech.member.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public ArrayList<Member> SelectMember(){
        return mapper.SelectMember();
    }
}
