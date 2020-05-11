package com.zys.boot_jeep.LoginController;


import com.zys.boot_jeep.domain.Users;
import com.zys.boot_jeep.service.UsersService;
import com.zys.boot_jeep.util.ResultObj;
import com.zys.boot_jeep.util.Users_util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.util.WebUtils;
import org.crazycake.shiro.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小张666
 * @since 2020-03-14
 */
@RestController
@RequestMapping("api/user")
public class UsersController {

    //redis存在时间 7 天
    private final Integer RedisLongTime = 7;

    @Autowired
    UsersService usersService;

    @Autowired
    RedisManager iRedisManager;

    @Autowired
    public StringRedisTemplate stringRedisTemplate;

    private JedisPool jedisPool;

    //注册
    /**
    * @Description: 
    * @Param: [users]
    * @return: com.zys.boot_jeep.util.ResultObj
    * @Author: xiaozhang666
    * @Date: 2020/4/21
    */ 
    @RequestMapping(value = "regs",method = RequestMethod.POST)
    @ResponseBody
    public ResultObj regs(Users users){
        try {
            /**
             *产生9位不同的随机数
             */
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<9;i++){
                sb.append((int)(Math.random()*10));
            }
            users.setOnt_md5_pwd(users.getUpwd());
            users.setUpwd(new Md5Hash(users.getUpwd(),sb.toString(),2).toString());
            users.setUid(sb.toString());
            users.setZt(0);
            users.setUoid(Users_util.getUUID());
            users.setBr(Users_util.getNowDate());
            System.out.println(users);
            int res = usersService.regs(users);
            return ResultObj.REGS_SUCC;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.REGS_BUG;
        }
    }

    //登录 shiro验证
    /**
    * @Description: 
    * @Param: [users]
    * @return: com.zys.boot_jeep.util.ResultObj
    * @Author: xiaozhang666
    * @Date: 2020/4/21
    */ 
    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    public ResultObj login(Users users){
        System.out.println(users+"----------");
        try {
            //创建管理器
            Subject subject= SecurityUtils.getSubject();
            String username = users.getUid();
            String pwd = users.getUpwd();
            //调用realmuser的认证
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,pwd);
            subject.login(usernamePasswordToken);
            users = (Users) subject.getPrincipal();
            //得到shiro的sessionid==token
            String token = subject.getSession().getId().toString();
            System.out.println(token+"----------------------------------");
            //是否验证成功subject.isAuthenticated()
            System.out.println(subject.isAuthenticated()+"--------------------------------------shiro验证成功");
//            System.out.println(subject+"测试对象地址");
//            jedisPool = iRedisManager.getJedisPool();
////            jedisPool.get
//            SetParams setParams = new SetParams();
//            //登陆状态存储时间
//            jedisPool.getResource().set(users.getUid(),token);
//            jedisPool.getResource().expire(users.getUid(),  24 * 3600);
//            System.out.println("redis过期时间为:" +jedisPool.getResource().ttl(users.getUid()));
//            jedisPool.getResource().set(users.getUid(),token,setParams.ex(RedisLongTime * 24 * 60 * 60));
            return new ResultObj(200,"登陆成功",token);
        }catch (AuthenticationException e){
            e.printStackTrace();
            return new ResultObj(-1,"用户或密码不正确");
        }
    }
    /**
     * 验证当前token是否登陆
     */
    /**
    * @Description: 
    * @Param: [request, response]
    * @return: com.zys.boot_jeep.util.ResultObj
    * @Author: xiaozhang666
    * @Date: 2020/4/21
    */ 
    @RequestMapping("checkLogin")
    @ResponseBody
    public ResultObj checkLogin(ServletRequest request, ServletResponse response){
        Subject subject=SecurityUtils.getSubject();
        jedisPool = iRedisManager.getJedisPool();
        //从redis取登陆状态，没有的话退出登录，登陆过起
        String header = WebUtils.toHttp(request).getHeader("USERINFO");
        String values= jedisPool.getResource().get(header);
        System.out.println(values);
        if(StringUtils.hasText(values)){

        }
        if(subject.isAuthenticated()){
            return ResultObj.IS_LOGIN;
        }else{
            return ResultObj.UN_LOGIN;
        }
    }

    /**
    * @Description:
    * @Param: []
    * @return: java.lang.Long
    * @Author: xiaozhang666
    * @Date: 2020/4/24
    */
    //查看redis过期时间
    @RequestMapping("getRedisTime")
    public Long getRedisLongTime(){
        jedisPool = iRedisManager.getJedisPool();
        Subject subject= SecurityUtils.getSubject();
        System.out.println(subject.isAuthenticated()+"--------------------------------------shiro验证redistime");
        return jedisPool.getResource().ttl("214293784");
    }
}

