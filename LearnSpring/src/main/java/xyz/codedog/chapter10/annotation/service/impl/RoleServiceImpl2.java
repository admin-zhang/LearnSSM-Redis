package xyz.codedog.chapter10.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.codedog.chapter10.annotation.service.RoleService2;
import xyz.codedog.chapter10.pojo.Role1;

/**
 * @ClassName RoleServiceImpl
 * @Description RoleServiceImpl类
 * @Author panda
 * @Date 2020/4/4 上午10:18
 * @Version 1.0
 **/
@Component("RoleService2")
public class RoleServiceImpl2 implements RoleService2 {

    @Autowired
    private Role1 role1 = null;

    public Role1 getRole1() {
        return role1;
    }

    public void setRole1(Role1 role1) {
        this.role1 = role1;
    }

    @Override
    public void printRoleInfo1() {
        System.out.println("id = " + role1.getId());
        System.out.println("roleName = " + role1.getRoleName());
        System.out.println("note = " + role1.getNote());
    }
}
