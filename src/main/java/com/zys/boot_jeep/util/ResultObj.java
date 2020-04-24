package com.zys.boot_jeep.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program:
 * @author:
 * @create: 2020-01-04 09:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    public static final ResultObj IS_LOGIN =new ResultObj(200,"已登陆");
    public static final ResultObj UN_LOGIN =new ResultObj(-1,"未登陆");
    public static final ResultObj REGS_SUCC =new ResultObj(200,"注册成功");
    public static final ResultObj REGS_BUG =new ResultObj(200,"注册失败");
    public static final ResultObj LOG_SUCC =new ResultObj(200,"登录成功");
    public static final ResultObj LOG_OUT=new ResultObj(200,"登录成功");

    public static final ResultObj TOKEN_SUCC =new ResultObj(200,"验证成功");
    public static final ResultObj TOKEN_OUT=new ResultObj(266,"重新登陆");

    public static final ResultObj DELETE_SUCCESS = new ResultObj(200,"删除成功");
    public static final ResultObj DELETE_ERROR =  new ResultObj(-1,"删除失败") ;

    public static final ResultObj ADD_SUCCESS = new ResultObj(200,"添加成功");
    public static final ResultObj ADD_ERROR =  new ResultObj(-1,"添加失败") ;

    public static final ResultObj UPDATE_SUCCESS = new ResultObj(200,"更新成功");
    public static final ResultObj UPDATE_ERROR =  new ResultObj(-1,"更新失败") ;
    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(200,"分配成功");
    public static final ResultObj DISPATCH_ERROR = new ResultObj(-1,"分配失败");
    public static final ResultObj RESET_SUCCESS = new ResultObj(200,"重置成功");
    public static final ResultObj RESET_ERROR = new ResultObj(-1,"重置成功");

    private Integer code=200;
    private String msg="";
    private Object token="";


    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
