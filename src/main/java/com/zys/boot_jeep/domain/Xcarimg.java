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
 * @since 2020-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zys_xcarimg")
public class Xcarimg implements Serializable {

    private static final long serialVersionUID=1L;

    private String xcarid;

    private String xcarimg;


}
