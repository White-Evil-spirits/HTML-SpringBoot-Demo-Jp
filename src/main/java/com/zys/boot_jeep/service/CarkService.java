package com.zys.boot_jeep.service;

import com.zys.boot_jeep.domain.Cark;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 小张666
 * @since 2020-04-21
 */
public interface CarkService extends IService<Cark> {
    //所有产品
    public List getAllCar(Integer page);
}
