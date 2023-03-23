package com.guy.spring.interfaces;

/**
 * @author Guy
 * @date 2022/7/29 19:03
 */
public interface DisposableBean {
    void destroy() throws Exception;
}
