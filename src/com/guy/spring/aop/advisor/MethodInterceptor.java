package com.guy.spring.aop.advisor;

/**
 * 环绕通知
 * @author Guy
 * @date 2022/7/7 22:45
 */
public interface MethodInterceptor extends Interceptor {

    Object invoke(MethodInvocation invocation) throws Throwable;
}
