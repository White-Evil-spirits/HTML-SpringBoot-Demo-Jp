package com.zys.boot_jeep.shiro;


import com.zys.boot_jeep.domain.Users;
import com.zys.boot_jeep.service.UsersService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;


/**
* @Description:
* @Param:
* @return:
* @Author: xiaozhang666
* @Date: 2020/4/21
*/
public class UserRealm extends AuthorizingRealm {


    @Autowired
    @Lazy
    private UsersService usersService;


    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName=token.getPrincipal().toString();
        Users users = this.usersService.queryUserByLoginName(userName);
        if(null!=users){
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(users,users.getUpwd(),ByteSource.Util.bytes(users.getUid()) ,getName());
            return info;
        }
        return null;
    }


    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        SimpleAuthorizationInfo info =new SimpleAuthorizationInfo();
//        ActiveUser activeUser= (ActiveUser) principals.getPrimaryPrincipal();
//        List<String> permissions = activeUser.getPermissions();
//        List<String> roles = activeUser.getRoles();
//        User user = activeUser.getUser();
//        if(user.getType().equals(Constant.USER_TYPE_SUPER)){
//            info.addStringPermission("*:*");
//        }else{
//            if(null!=roles&&roles.size()>0){
//                info.addRoles(roles);
//            }
//            if(null!=permissions&&permissions.size()>0){
//                info.addStringPermissions(permissions);
//            }
//        }
        return null;
    }
}
