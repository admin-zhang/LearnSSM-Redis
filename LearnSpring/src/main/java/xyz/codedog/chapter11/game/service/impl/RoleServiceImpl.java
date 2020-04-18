package xyz.codedog.chapter11.game.service.impl;

import xyz.codedog.chapter11.game.pojo.Role;
import xyz.codedog.chapter11.game.service.RoleService;

/**
 * @ClassName RoleServiceImpl
 * @Description RoleService实现类
 * @Author panda
 * @Date 2020/4/5 下午6:23
 * @Version 1.0
 **/
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id = " + role.getId()
         + ", roleName = " + role.getRoleName()
        + ", note = " + role.getNote() + "}");
    }
}
