package xyz.codedog.chapter10.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.codedog.chapter10.annotation.pojo.PojoConfig;
import xyz.codedog.chapter10.pojo.Role1;

/**
 * @ClassName AnnotationMain
 * @Description 使用注解生产Spring IOC容器
 * @Author panda
 * @Date 2020/4/4 上午10:12
 * @Version 1.0
 **/
public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PojoConfig.class);
        Role1 role1 = applicationContext.getBean(Role1.class);
        System.err.println(role1.getId());
    }
}
