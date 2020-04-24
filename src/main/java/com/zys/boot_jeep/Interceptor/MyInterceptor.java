package com.zys.boot_jeep.Interceptor;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.crazycake.shiro.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Autowired
    RedisManager iRedisManager;

    private JedisPool jedisPool;
    //方法执行前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("zys preHandle");
        String token = request.getHeader("TOKEN");
        String userinfo = request.getHeader("USERINFO");
        System.out.println(token);
        System.out.println(userinfo);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        jedisPool = iRedisManager.getJedisPool();
        Subject subject= SecurityUtils.getSubject();
        //shiro已经登陆 token和redis必须相同
        try{
            if(jedisPool.getResource().get(userinfo) == token && subject.isAuthenticated()){
                return true;
            }else{
                subject.logout();
                writer.print("{\"code\":-101, \"msg\":\"登录过期\"}");
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            writer.print("{\"code\":-908, \"msg\":\"redis的key或value为空\"}");
        }finally {
            return false;
        }

//        Map<String, Object> map = new HashMap<>();
//        map.put("msg","未登录");
//        map.put("code",266);
    }

    //方法执行后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("zys zhixing postHandle");
    }

    //页面渲染前
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("zys zhixing afterCompletion");
    }
}
