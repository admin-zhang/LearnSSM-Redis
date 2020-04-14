package xyz.codedog.chapter3.xml.service.impl;

import xyz.codedog.chapter3.aop.verifier.RoleVerifier;
import xyz.codedog.chapter3.game.pojo.Role;
import xyz.codedog.chapter3.xml.service.RoleService;

/**
 * @ClassName RoleServiceImpl
 * @Description XML配置AOP拦截实现类
 * @Author Administrator
 * @Date 2020/4/13 10:39
 * @Version 1.0
 **/
public class RoleServiceImpl implements RoleService {
    public RoleVerifier roleVerifier = null;

    @Override
    public void printRole(Role role) {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("note = " + role.getNote());
    }
}
