package xyz.codedog.chapter2.annotation.controller;

import org.springframework.stereotype.Component;
import xyz.codedog.chapter2.annotation.service.RoleService;

/**
 * @ClassName RoleController2
 * @Description 有参构造
 * @Author panda
 * @Date 2020/4/4 下午5:02
 * @Version 1.0
 **/
@Component
public class RoleController2 {
    private RoleService roleService = null;

    public RoleController2(RoleService roleService) {
        this.roleService = roleService;
    }

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
}
