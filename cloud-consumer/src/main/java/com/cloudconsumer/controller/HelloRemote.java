package com.cloudconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback: 指定fallback类，在服务熔断的时候返回fallback类中的内容
 *
 * @author 梁朴生
 */
@FeignClient(name = "cloud-provider", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String sayHello(@RequestParam("name") String name);
}