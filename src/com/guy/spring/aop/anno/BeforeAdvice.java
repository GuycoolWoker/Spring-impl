package com.guy.spring.aop.anno;

import com.guy.spring.aop.AspectInstanceFactory;
import com.guy.spring.aop.advisor.Advice;
import com.guy.spring.aop.advisor.CommonAdvice;
import com.guy.spring.aop.advisor.MethodInterceptor;
import com.guy.spring.aop.advisor.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author Guy
 * @date 2022/7/7 23:00
 */
public class BeforeAdvice extends CommonAdvice implements Advice, MethodInterceptor {

    public BeforeAdvice(Method aspectJAdviceMethod, AspectInstanceFactory aspectInstanceFactory) {
        super(aspectJAdviceMethod, aspectInstanceFactory);
    }

    /*
    	public Object invoke(MethodInvocation mi) throws Throwable {
		this.advice.before(mi.getMethod(), mi.getArguments(), mi.getThis());
		return mi.proceed();
	}
     */

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before();
        return invocation.proceed();
    }

    public void before () throws Throwable {
        invokeAdviceMethod(null,null);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
