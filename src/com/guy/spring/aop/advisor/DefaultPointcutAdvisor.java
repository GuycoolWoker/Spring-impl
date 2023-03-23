package com.guy.spring.aop.advisor;

import com.guy.spring.core.Ordered;

/**
 * @author Guy
 * @date 2022/7/8 00:12
 */
public class DefaultPointcutAdvisor implements Advisor {

    private Pointcut pointcut;
    private Advice advice;

    public DefaultPointcutAdvisor(Pointcut pointcut, Advice advice) {
        this.pointcut = pointcut;
        this.advice = advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public int getOrder() {
        return this.advice.getOrder();
    }
}
