package com.zhy.people.config;

import com.zhy.people.shiro.PeopleShiroRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;
import java.util.LinkedHashMap;
import java.util.Map;

//@Configuration
public class ShiroConfiguration {

    /**
     *  realm
     */
    @Bean
    public PeopleShiroRealm peopleShiroRealm(){
        PeopleShiroRealm peopleShiroRealm = new PeopleShiroRealm();
        return peopleShiroRealm;
    }

    /**
     *  SecurityManager
     */
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(peopleShiroRealm());
        return securityManager;
    }



    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {


        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/**", "authc");

        //登录页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        //登录成功跳转页面
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //未授权页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;

    }



}
