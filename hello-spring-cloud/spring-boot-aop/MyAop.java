package com.mytransaction.myaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Component
@Aspect
public class MyAop {


    @Before("execution(* com.itmayiedu.service.UserService.add(..))")
    public void before(){ }

    @AfterReturning("execution(* com.itmayiedu.service.UserService.add(..))")
    public void returning(){ }

    @After("execution(* com.itmayiedu.service.UserService.add(..))")
    public void after(){ }

    @AfterThrowing("execution(* com.itmayiedu.service.UserService.add(..))")
    public void Throwing(){ }


    @Around("execution(* com.itmayiedu.service.UserService.add(..))")
    public void aVoid()  { }
}
