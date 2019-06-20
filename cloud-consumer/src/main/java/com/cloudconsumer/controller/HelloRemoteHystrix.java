package com.cloudconsumer.controller;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 创建回调类，在服务不可用时，会触发回调
 *
 * @author 梁朴生
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String sayHello(String name) {
        return "hello " + name + ", the message send fail!";
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
