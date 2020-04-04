package xyz.codedog.chapter2.annotation.service.impl;

import org.springframework.stereotype.Component;
import xyz.codedog.chapter2.annotation.service.RoleService;
import xyz.codedog.chapter2.pojo.Role1;

/**
 * @ClassName RoleServiceImpl
 * @Description RoleServiceImpl类
 * @Author panda
 * @Date 2020/4/4 上午10:18
 * @Version 1.0
 **/
@Component("roleService3")
public class RoleServiceImpl3 implements RoleService {

    @Override
    public void printRoleInfo(Role1 role1) {
        System.out.println("id = " + role1.getId());
        System.out.println("roleName = " + role1.getRoleName());
        System.out.println("note = " + role1.getNote());
    }

}
