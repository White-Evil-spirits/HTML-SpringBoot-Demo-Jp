package com.zys.boot_jeep.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 小张666
 * @since 2020-04-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zys_cark")
public class Cark implements Serializable {

    private static final long serialVersionUID=1L;

    private String carid;

    private String carimg;

    private String carname;

    private String cartext;

    private Integer carzt;


}
