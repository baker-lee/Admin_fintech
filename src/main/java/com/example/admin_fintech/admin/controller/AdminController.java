package com.example.admin_fintech.admin.controller;

import com.example.admin_fintech.admin.dto.AdminDto;
import com.example.admin_fintech.admin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@Api(tags = {"관리자서비스"}, description = "관리자 관련 서비스")
@RestController
public class AdminController {

    @Autowired
    AdminService as;

    @PostMapping("/login")
    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    public String login(AdminDto params, @ApiIgnore HttpSession httpSession) {
        AdminDto result = as.login(params);
        if(result !=null) {
            String id = result.getId();
            httpSession.setAttribute("id", id);
            return "redirect:/index";
        }
        return "redirect:/";
    }
}
