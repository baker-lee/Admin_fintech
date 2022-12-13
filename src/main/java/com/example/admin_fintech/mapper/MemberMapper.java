package com.example.admin_fintech.mapper;


import com.example.admin_fintech.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MemberMapper {

    public ArrayList<Member> SelectMember();
}
