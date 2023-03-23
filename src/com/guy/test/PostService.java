package com.guy.test;

import com.guy.spring.anno.Component;

/**
 * @author Guy
 * @date 2022/7/8 03:50
 */
@Component
public class PostService implements PostInterface {
    @Override
    public void post() {
        System.out.println("post........");
    }
}
