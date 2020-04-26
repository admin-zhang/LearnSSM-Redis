package xyz.codedog.chapter13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.codedog.chapter13.pojo.Role;
import xyz.codedog.chapter13.service.RoleListService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Chapter13Main
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/19 11:10
 * @Version 1.0
 **/
public class Chapter13Main {
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter13/applicationContext.xml");
        RoleListService roleListService = applicationContext.getBean(RoleListService.class);
        List<Role> roleList = new ArrayList<Role>();
        for (int i = 1; i <= 2;i++){
            Role role = new Role();
            role.setRoleName("role_name_" + i);
            role.setNote("note_" + i);
            roleList.add(role);
        }
        int couunt = roleListService.insertRoleList(roleList);
        System.out.println(couunt);
    }
}
