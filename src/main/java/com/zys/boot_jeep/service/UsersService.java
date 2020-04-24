package com.zys.boot_jeep.service;

import com.zys.boot_jeep.domain.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 小张666
 * @since 2020-03-14
 */
public interface UsersService extends IService<Users> {
    //注册账号
    Integer regs(Users users);
    //根据账号查询有无此人
    Users queryUserByLoginName(String userName);
}
