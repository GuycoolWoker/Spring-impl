package com.guy.test.circular_references;

import com.guy.spring.anno.Component;
import com.guy.spring.aop.anno.After;
import com.guy.spring.aop.anno.Aspect;
import com.guy.spring.aop.anno.Before;

/**
 * @author Guy
 * @date 2022/7/24 00:07
 */
@Aspect
@Component
public class MyAspect {

    @Before("execution(* *.(A|B).*())")
    public void before01() {
        System.out.println("before01...");
    }

    @After("execution(* *.(A|B).*())")
    public void after01() {
        System.out.println("after01...");
    }

}
