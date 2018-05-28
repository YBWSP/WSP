package com.zhy.people.controller.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test1")
public class Test1Controller {


    @RequestMapping(value = "/test1/{id}",method = RequestMethod.GET)
    public Map<String,Object> test1(@PathVariable(name="id") int id)
    {
        Map<String,Object> result=new HashMap<String, Object>();
        result.put("abc","abc");
        return result;
    }

}