package com.example.admin_fintech.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AdminAop {

    @Pointcut("execution(* com.example.admin_fintech.*.controller..*.Select*(..))")
    public void cut(){}

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws  Throwable{

        HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
        if (session.getAttribute("id") == null){
            return null;
        } else {
            return joinPoint.proceed();
        }
    }


}
