package com.zys.boot_jeep.beanApp;

import com.zys.boot_jeep.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: boot_jeep
 * @description:
 * @author: Mr.Wang
 * @create: 2020-04-30 11:52
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class xCarShowBean  extends Cark {
    private List<Carimg> carimgList;
    private List<Carpeizhi> carpeizhiList;
    private List<Color> colorList;
    private List<Xcarimg> xcarimgList;
}
