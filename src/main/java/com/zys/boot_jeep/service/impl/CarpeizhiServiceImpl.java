package com.zys.boot_jeep.service.impl;

import com.zys.boot_jeep.beanApp.xCarShowBean;
import com.zys.boot_jeep.domain.Carpeizhi;
import com.zys.boot_jeep.mapper.CarpeizhiMapper;
import com.zys.boot_jeep.service.CarpeizhiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小张666
 * @since 2020-04-28
 */
@Service
public class CarpeizhiServiceImpl extends ServiceImpl<CarpeizhiMapper, Carpeizhi> implements CarpeizhiService {

    @Override
    public xCarShowBean showXCar(String carid) {
        return this.getBaseMapper().showXCar(carid);
    }
}
