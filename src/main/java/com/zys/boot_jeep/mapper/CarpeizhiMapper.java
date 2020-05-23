package com.zys.boot_jeep.mapper;

import com.zys.boot_jeep.beanApp.xCarShowBean;
import com.zys.boot_jeep.domain.Carpeizhi;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 小张666
 * @since 2020-04-28
 */
public interface CarpeizhiMapper extends BaseMapper<Carpeizhi> {
    xCarShowBean showXCar(String carid);
}
