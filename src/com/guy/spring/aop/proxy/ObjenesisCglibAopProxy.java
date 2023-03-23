package com.guy.spring.aop.proxy;

/**
 * TODO 使用 cglib 动态代理
 * @author Guy
 * @date 2022/7/8 01:16
 */
public class ObjenesisCglibAopProxy implements AopProxy {

    private ProxyFactory proxyFactory;

    public ObjenesisCglibAopProxy(ProxyFactory proxyFactory) {
        this.proxyFactory = proxyFactory;
    }

    @Override
    public Object getProxy() {
        return null;
    }
}
