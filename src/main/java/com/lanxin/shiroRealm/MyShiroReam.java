package com.lanxin.shiroRealm;

import com.lanxin.dao.Iuserdao;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 2019/9/26.
 */
class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private Iuserdao userimpl;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Object o = principalCollection.getPrimaryPrincipal();
        if (o instanceof String) {
            String username = (String) o;
            //authorizationInfo.addRoles(userimpl.selectjuesebyusername());
            authorizationInfo.addStringPermissions(userimpl.slectquanxibyjuese(username));

        }
        return authorizationInfo;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String username = (String) authenticationToken.getPrincipal();
        String password = userimpl.selctpassbyusername(username);

        if (password != null) {
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());

            return authenticationInfo;
        }

        return null;
    }
}
