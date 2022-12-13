package com.example.admin_fintech.contact.repository;

import com.example.admin_fintech.contact.dto.Contact;
import com.example.admin_fintech.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public ArrayList<Contact> SelectContact(){
        return mapper.SelectContact();
    }
}
