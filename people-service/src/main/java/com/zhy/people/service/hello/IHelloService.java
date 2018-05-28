package com.zhy.people.service.hello;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "people")
public interface IHelloService {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
