package com.guy.spring.aop.anno;

import com.guy.spring.aop.AspectInstanceFactory;
import com.guy.spring.aop.advisor.Advice;
import com.guy.spring.aop.advisor.CommonAdvice;
import com.guy.spring.aop.advisor.MethodInterceptor;
import com.guy.spring.aop.advisor.MethodInvocation;
import com.guy.spring.aop.advisor.joinpoint.MethodInvocationProceedingJoinPoint;
import com.guy.spring.aop.advisor.joinpoint.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @author Guy
 * @date 2022/7/8 22:50
 */
public class AroundAdvice extends CommonAdvice implements Advice, MethodInterceptor {

    public AroundAdvice(Method aspectJAdviceMethod, AspectInstanceFactory aspectInstanceFactory) {
        super(aspectJAdviceMethod, aspectInstanceFactory);
    }

    /*
    	@Override
	@Nullable
	public Object invoke(MethodInvocation mi) throws Throwable {
		if (!(mi instanceof ProxyMethodInvocation)) {
			throw new IllegalStateException("MethodInvocation is not a Spring ProxyMethodInvocation: " + mi);
		}
		ProxyMethodInvocation pmi = (ProxyMethodInvocation) mi;
		ProceedingJoinPoint pjp = lazyGetProceedingJoinPoint(pmi);
		JoinPointMatch jpm = getJoinPointMatch(pmi);
		return invokeAdviceMethod(pjp, jpm, null, null);
	}

    protected ProceedingJoinPoint lazyGetProceedingJoinPoint(ProxyMethodInvocation rmi) {
        return new MethodInvocationProceedingJoinPoint(rmi);
    }
     */

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        ProceedingJoinPoint pjp = getProceedingJoinPoint(invocation);
        return around(pjp);
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return invokeAdviceMethod(pjp, null);
    }

    protected ProceedingJoinPoint getProceedingJoinPoint(MethodInvocation mi) {
        return new MethodInvocationProceedingJoinPoint(mi);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
