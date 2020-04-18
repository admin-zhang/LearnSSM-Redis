package xyz.codedog.chapter11.aop.service.impl;

import org.springframework.stereotype.Component;
import xyz.codedog.chapter11.game.pojo.Role;
import xyz.codedog.chapter11.aop.service.RoleService;

/**
 * @ClassName RoleServiceImpl
 * @Description RoleService实现类
 * @Author Administrator
 * @Date 2020/4/12 18:01
 * @Version 1.0
 **/
@Component
public class RoleServiceImpl implements RoleService {
   /* @Override
    public void printRole(Role role,int sort) {
        System.out.println("{id: " + role.getId() + "roleName: " + "," + role.getRoleName() + "," +
                "note: " + role.getNote() + "}");
        System.out.println(sort);
    }*/

    @Override
    public void printRole(Role role) {
        System.out.println("{id: " + role.getId() + "roleName: " + "," + role.getRoleName() + "," +
                "note: " + role.getNote() + "}");
    }
}
