package com.zys.boot_jeep.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Users_util {
    //生成id
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
    //获取当前时间
    public static String getNowDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
