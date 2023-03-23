package com.guy.spring.aop;

/**
 * 提供调用切面方法的类
 * @author Guy
 * @date 2022/7/7 21:47
 */
public interface AspectInstanceFactory {
    /**
     * Create an instance of this factory's aspect.
     * @return the aspect instance (never {@code null})
     */
    Object getAspectInstance();
}
