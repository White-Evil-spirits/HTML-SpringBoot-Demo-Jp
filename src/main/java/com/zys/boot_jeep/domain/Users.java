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
 * @since 2020-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zys_users")
public class Users implements Serializable {

    private static final long serialVersionUID=1L;

    private String uoid;

    private String uid;

    private String uname;

    private String upwd;

    private String ushenfen;

    private String uaddr;

    private Integer usex;

    private String utell;

    private String br;

    private Integer zt;

    private String ont_md5_pwd;
}
