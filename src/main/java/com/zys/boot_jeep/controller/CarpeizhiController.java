package com.zys.boot_jeep.controller;


import com.zys.boot_jeep.beanApp.xCarShowBean;
import com.zys.boot_jeep.service.CarpeizhiService;
import com.zys.boot_jeep.util.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小张666
 * @since 2020-04-28
 */
@RestController
@RequestMapping("/api/carpeizhi")
public class CarpeizhiController {

    @Autowired
    CarpeizhiService carpeizhiService;

    /**
    * @Description: 
    * @Param: [carid]
    * @return: com.zys.boot_jeep.util.DataGridView
    * @Author: xiaozhang666
    * @Date: 2020/5/21
    */ 
    @RequestMapping("xCar")
    public DataGridView showXCar(String carid){
        xCarShowBean xCarShowBean= carpeizhiService.showXCar(carid);
        return new DataGridView(200,xCarShowBean);
    }
}

