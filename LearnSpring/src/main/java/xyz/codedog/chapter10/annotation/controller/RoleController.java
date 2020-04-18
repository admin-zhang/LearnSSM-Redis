package xyz.codedog.chapter10.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import xyz.codedog.chapter10.annotation.service.RoleService;
import xyz.codedog.chapter10.pojo.Role1;

/**
 * @ClassName RoleController
 * @Description RoleController类
 * @Author panda
 * @Date 2020/4/4 上午10:55
 * @Version 1.0
 **/
@Component

public class RoleController {
    @Autowired
    @Qualifier("roleService3")
    private RoleService roleService = null;

    public void printRole(Role1 role1) {
        roleService.printRoleInfo(role1);
    }
}
