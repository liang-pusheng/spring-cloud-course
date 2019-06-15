package com.cloudconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloud-provider")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String sayHello(@RequestParam("name") String name);
}