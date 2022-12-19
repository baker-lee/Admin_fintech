package com.example.admin_fintech.page.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Api(tags = "페이징", description = "페이지 컨트롤 관련 서비스")
@Controller
public class PageController {

    @ApiOperation(value = "로그인", notes = "로그인 페이지로 이동")
    @GetMapping("/")
    public String login() {
        return "login";
    }

    @ApiOperation(value = "메인페이지", notes = "로그인 후 메인 페이지로 이동")
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "회원 목록 페이지", notes = "회원 목록 페이지로 이동")
    @GetMapping("/goMember")
    public String goMember() {
        return "memberList";
    }

    @ApiOperation(value = "결제 목록 페이지", notes = "결제 목록 페이지로 이동")
    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @ApiOperation(value = "구매 목록 페이지", notes = "코인 구매 목록 페이지로 이동")
    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @ApiOperation(value = "연락 요청 목록 페이지", notes = "연락 요청 목록 페이지로 이동")
    @GetMapping("/goContact")
    public String goContact(){
        return "contactList";
    }

    @ApiOperation(value = "구독 요청 목록 페이지", notes = "구독 요청 목록 페이지로 이동")
    @GetMapping("/goSubscribe")
    public String goSubscribe(){
        return "subscribeList";
    }


    @ApiOperation(value = "로그아웃", notes = "세션 종료를 통한 로그아웃 후 로그인 페이지로 이동")
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
