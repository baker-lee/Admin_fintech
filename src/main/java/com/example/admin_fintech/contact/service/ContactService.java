package com.example.admin_fintech.contact.service;


import com.example.admin_fintech.contact.dto.Contact;
import com.example.admin_fintech.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public ArrayList<Contact> SelectContact(){
        return cr.SelectContact();
    }
}
