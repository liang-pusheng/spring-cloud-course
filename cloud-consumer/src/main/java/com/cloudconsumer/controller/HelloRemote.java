package com.cloudconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback: 指定fallback类，在服务熔断的时候返回fallback类中的内容
 * name: 提供服务的名称，这是用来创建Ribbon Client(Feign整合了Ribbon)的。
 * <p>
 * 注意：如果被调用服务的Controller类上有@RequestMapping注解的话，不可直接在Feign接口上使用@RequestMapping
 * 注解，启动会报错。可直接将@RequestMapping中的路径注解书写在Feign方法的注解中。
 * <p>
 * 除了使用一个类继承HelloRemote并实现其方法的方式来实现保护功能外，还可以使用@HystrixCommand的方式。
 * 详细使用可见HelloController类。
 *
 * @author 梁朴生
 */
@FeignClient(name = "cloud-provider" /*fallback = HelloRemoteHystrix.class*/)
public interface HelloRemote {

    @RequestMapping(value = "/user/hello")
    String sayHello(@RequestParam("name") String name);
}