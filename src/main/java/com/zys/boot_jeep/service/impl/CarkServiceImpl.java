package com.zys.boot_jeep.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zys.boot_jeep.domain.Cark;
import com.zys.boot_jeep.mapper.CarkMapper;
import com.zys.boot_jeep.service.CarkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小张666
 * @since 2020-04-21
 */
@Service
public class CarkServiceImpl extends ServiceImpl<CarkMapper, Cark> implements CarkService {

    @Override
    public IPage getAllCar(Integer page) {
        IPage<Cark> iPage = new Page<>(page, 3);
        QueryWrapper queryWrapper = new QueryWrapper();
//        List<Cark> list = this.baseMapper.selectList(queryWrapper);
        this.baseMapper.selectPage(iPage,queryWrapper);
        List<Cark> list =  iPage.getRecords();
        System.out.println(list);
        return iPage;
    }

}
