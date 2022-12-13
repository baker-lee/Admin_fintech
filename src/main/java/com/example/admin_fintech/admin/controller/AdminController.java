package com.example.admin_fintech.admin.controller;

import com.example.admin_fintech.admin.dto.AdminDto;
import com.example.admin_fintech.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class AdminController {

    @Autowired
    AdminService as;

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String, Object> params, HttpSession httpSession) {
        AdminDto veryfied = as.login(adminDto);
        if(veryfied !=null) {
            String id = String.valueOf(veryfied.getId());
            httpSession.setAttribute("id", id);
        }
        return "redirect:/index";
    }
}
