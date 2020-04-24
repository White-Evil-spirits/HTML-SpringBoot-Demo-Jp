package com.zys.boot_jeep.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zys.boot_jeep.domain.Users;
import com.zys.boot_jeep.mapper.UsersMapper;
import com.zys.boot_jeep.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小张666
 * @since 2020-03-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
    @Override
    public Integer regs(Users users) {
        int is_succ = this.getBaseMapper().insert(users);
        System.out.println(is_succ);
        return is_succ;
    }

    //根据账号查询有无此人
    public Users queryUserByLoginName(String userName){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",userName);
        Users users = this.getBaseMapper().selectOne(queryWrapper);
        System.out.println(users+"-----------queryUserByLoginName");
        return users;
    };
}
