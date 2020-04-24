package com.zys.boot_jeep.config;

import com.zys.boot_jeep.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Bean
    public HandlerInterceptor getTokenInterceptor(){
        return new MyInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //'/*'匹配一个请求
        //放行的请求为注册和登录
//        registry.addInterceptor(getTokenInterceptor()).addPathPatterns("/api/**").excludePathPatterns("/api/user/doLogin","/api/user/regs","/api/user/getRedisTime");
//        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
