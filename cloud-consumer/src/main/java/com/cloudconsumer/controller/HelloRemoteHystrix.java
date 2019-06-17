package com.cloudconsumer.controller;

import org.springframework.stereotype.Component;

/**
 * 创建回调类，在服务不可用事，会触发回调
 *
 * @author 梁朴生
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String sayHello(String name) {
        return "hello " + name + ", the message send fail!";
    }
}
