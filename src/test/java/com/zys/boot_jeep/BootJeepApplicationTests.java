package com.zys.boot_jeep;

import com.zys.boot_jeep.util.Users_util;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@SpringBootTest
class BootJeepApplicationTests {
//
//    @Test
//    void contextLoads() {
//        System.out.println(Users_util.getNowDate()+"---");
//    }
//
//    @Test
//    void contextLoads2() {
//        //连接Redis服务
//        Jedis jedis=new Jedis("62.234.118.219",6379);
//        //查看服务器是否运行，打出pong表示OK
//        jedis.set("test", "www.zys.com666");
//        System.out.println("connect is OK============>"+jedis.ping());
//        System.out.println(jedis.ttl("214293784"));
//    }


}
