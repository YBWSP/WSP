package com.zhy.people.controller.index;

import com.zhy.people.beans.B;
import com.zhy.people.service.b.IBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IBService ibService;

    @Resource
    private DiscoveryClient client;


    //直接返回发现服务信息
    @RequestMapping("/client")
    @ResponseBody
    public Object discover() {
        return this.client;
    }


    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response)
    {
        return "/index/index";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response)
    {
        List<B> bList=ibService.getAllB();
        request.setAttribute("bList",ibService.getAllB());
        System.out.println("b_size="+bList.size());
        return "/index/test";
    }
}
