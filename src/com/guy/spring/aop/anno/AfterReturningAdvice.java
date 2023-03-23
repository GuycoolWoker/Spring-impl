package com.guy.spring.aop.anno;

import com.guy.spring.aop.AspectInstanceFactory;
import com.guy.spring.aop.advisor.Advice;
import com.guy.spring.aop.advisor.CommonAdvice;
import com.guy.spring.aop.advisor.MethodInterceptor;
import com.guy.spring.aop.advisor.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author Guy
 * @date 2022/7/7 23:27
 */
public class AfterReturningAdvice extends CommonAdvice implements Advice, MethodInterceptor {

    public AfterReturningAdvice(Method aspectJAdviceMethod, AspectInstanceFactory aspectInstanceFactory) {
        super(aspectJAdviceMethod, aspectInstanceFactory);
    }

    /*
    	@Override
	@Nullable
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object retVal = mi.proceed();
		this.advice.afterReturning(retVal, mi.getMethod(), mi.getArguments(), mi.getThis());
		return retVal;
	}

     */

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object retVal = invocation.proceed();
        afterReturning();
        return retVal;
    }

    public void afterReturning() throws Throwable {
        invokeAdviceMethod(null,null);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
