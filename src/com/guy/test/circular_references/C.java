package com.guy.test.circular_references;

import com.guy.spring.anno.Autowired;
import com.guy.spring.anno.Component;
import com.guy.spring.anno.Lazy;
import com.guy.spring.anno.Scope;
import com.guy.spring.interfaces.InitializingBean;

/**
 * @author Guy
 * @date 2022/7/25 03:07
 */
@Scope("prototype")
// @Component
public class C implements MyInterface, InitializingBean {

    /**
     * 采用 jdk 动态代理，注入的类型需要是接口类型
     */
    // @Autowired
    private MyInterface d;

    public C(@Lazy MyInterface d) {
        this.d = d;
        System.out.println("C 创建，构造注入的 d 为：" + d.getClass());
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("C 初始化");
    }

    @Override
    public void foo() {
        System.out.println("【【【【【【【【【【【【【【【【【C.foo start】......." + this.d.getClass());
        this.d.foo();
        System.out.println("【【【【【【【【【【【【【【【【【C.foo end】");
    }

    @Autowired
    public void setD(MyInterface d) {
        System.out.println("C 😋😋😋😋 依赖注入 setD(" + d.getClass().getName() + ")");
        this.d = d;
    }

}
