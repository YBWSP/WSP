package com.zhy.controller;


import com.zhy.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Test1Service test1Service;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response)
    {
        //String body=restTemplate.getForEntity("http://people/index/index",String.class).getBody();
        //request.setAttribute("abc",body);
        Map<String,Object> map=test1Service.test1(1);
        System.out.println(map);
        return "/budget/index";
    }

    @RequestMapping("/budget")
    @ResponseBody
    public Map<String, Object> budget()
    {
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("abc",123456);
        return result;
    }
}
