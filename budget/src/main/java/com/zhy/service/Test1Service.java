package com.zhy.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "people")
public interface Test1Service {

    @RequestMapping(value = "/test1/test1/{id}",method = RequestMethod.GET)
    public Map<String,Object> test1(@PathVariable(name="id") int id);
}
