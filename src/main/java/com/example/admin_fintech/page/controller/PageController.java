package com.example.admin_fintech.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/goMember")
    public String goMember() {
        return "memberList";
    }

    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @GetMapping("/goContact")
    public String goContact(){
        return "contactList";
    }

    @GetMapping("/goSubscribe")
    public String goSubscribe(){
        return "subscribeList";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
