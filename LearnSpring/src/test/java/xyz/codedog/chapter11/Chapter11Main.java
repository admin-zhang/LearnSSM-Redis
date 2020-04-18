package xyz.codedog.chapter11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.codedog.chapter11.aop.config.AopConfig;
import xyz.codedog.chapter11.aop.service.RoleService;
import xyz.codedog.chapter11.aop.verifier.RoleVerifier;
import xyz.codedog.chapter11.game.pojo.Role;
import xyz.codedog.chapter11.multi.bean.MultiBean;
import xyz.codedog.chapter11.multi.config.MultiConfig;

/**
 * @ClassName Chapter3Main
 * @Description Spring第三章测试类
 * @Author Administrator
 * @Date 2020/4/12 19:53
 * @Version 1.0
 **/
public class Chapter11Main {
    private static final String resources = "xyz/codedog/chapter3/aop/applicationContext.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resources);

    @Test
    public void testAOP() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService = context.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role-name-1");
        role.setNote("note-1");
        roleService.printRole(role);
        System.out.println("#########测试异常通知##########");
        role = null;
        roleService.printRole(role);
    }

    @Test
    public void testAOP1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService = context.getBean(RoleService.class);
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role-name-1");
        role.setNote("note-1");
        if (roleVerifier.verify(role)) {
            roleService.printRole(role);
        }
    }

    @Test
    public void testXML() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter3/xml/applicationContext.xml");
        xyz.codedog.chapter11.xml.service.RoleService roleService = applicationContext.getBean(xyz.codedog.chapter11.xml.service.RoleService.class);
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        Role role = new Role();
        role.setId(2L);
        role.setRoleName("role-name-1");
        role.setNote("note-1");
        roleService.printRole(role);
    }

    @Test
    public void testAspect() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter3/aspect/applicationContext.xml");
        Role role = new Role();
        role.setId(3L);
        role.setRoleName("role-name-3");
        role.setNote("note-3");
        xyz.codedog.chapter11.game.service.RoleService roleService = (xyz.codedog.chapter11.game.service.RoleService) applicationContext.getBean("roleService");
        roleService.printRole(role);
    }

    @Test
    public void testMulti() {
        for (int i = 0; i < 10; i++) {
            System.out.println("##############################################");
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MultiConfig.class);
            MultiBean multiBean = applicationContext.getBean(MultiBean.class);
            multiBean.testMulti();
        }
    }

}
