package com.zys.boot_jeep.service;

import com.zys.boot_jeep.beanApp.xCarShowBean;
import com.zys.boot_jeep.domain.Carpeizhi;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 小张666
 * @since 2020-04-28
 */
public interface CarpeizhiService extends IService<Carpeizhi> {
    public xCarShowBean showXCar(String carid);
}
