package com.example.admin_fintech.contact.controller;

import com.example.admin_fintech.contact.dto.Contact;
import com.example.admin_fintech.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactController {

    @Autowired
    ContactService cs;

    @GetMapping("/selectContact")
    public ArrayList<Contact> SelectContact(){
        return cs.SelectContact();
    }
}
