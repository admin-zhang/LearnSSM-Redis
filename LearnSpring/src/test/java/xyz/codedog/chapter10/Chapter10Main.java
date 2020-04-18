package xyz.codedog.chapter10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.codedog.chapter10.annotation.config.ApplicationConfig;
import xyz.codedog.chapter10.annotation.service.RoleService;
import xyz.codedog.chapter10.pojo.Role1;
import xyz.codedog.chapter10.properties.ApplocationConfig;

/**
 * @ClassName Chapter2Main
 * @Description 第二章测试类
 * @Author Administrator
 * @Date 2020/4/2 18:19
 * @Version 1.0
 **/
public class Chapter10Main {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role1 role1 = context.getBean(Role1.class);
        RoleService roleService = context.getBean(RoleService.class);
        roleService.printRoleInfo(role1);
        context.close();
    }

    @Test
    public void test02() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplocationConfig.class);
        String url = context.getEnvironment().getProperty("jdbc.database.url");
        System.out.println(url);
    }

}
