package com.lanxin.shiro;

import org.apache.shiro.mgt.*;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 曼珠沙华 on 2019/9/26.
 */
/**
 *
 */

@Configuration
public class ShiroConfig {

    public MyShiroRealm
    @Bean
    public SecurityManager securityManager()
    {
        DefaultWebSecurityManager securityManager =new DefaultWebSecurityManager();
//        设置realm
        securityManager.setRealm();
    }
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager)
    {
      ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);


        Map<String,String> map=new LinkedHashMap<String,String>();
//      过滤器顺序,不能颠倒
//        配置退出
        map.put("/logout","anon");
//        配置不会拦截的链接
        map.put("login","anon");
        map.put("/**","authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

//        没有登陆页面
        shiroFilterFactoryBean.setLoginUrl("/unanth");

        return shiroFilterFactoryBean;

    }


}
