package com.example.admin_fintech.mapper;

import com.example.admin_fintech.contact.dto.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ContactMapper {
    public ArrayList<Contact> SelectContact();
}
