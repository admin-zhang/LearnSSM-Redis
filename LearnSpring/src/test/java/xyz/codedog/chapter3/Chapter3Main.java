package xyz.codedog.chapter3;

import org.junit.Test;
<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.codedog.chapter3.aop.config.AopConfig;
import xyz.codedog.chapter3.aop.service.RoleService;
import xyz.codedog.chapter3.aop.verifier.RoleVerifier;
import xyz.codedog.chapter3.game.pojo.Role;

/**
 * @ClassName Chapter3Main
 * @Description Spring第三章测试类
 * @Author Administrator
 * @Date 2020/4/12 19:53
 * @Version 1.0
 **/
public class Chapter3Main {
    private static final String resources = "xyz/codedog/chapter3/applicationContext.xml";
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

=======
import xyz.codedog.chapter3.game.Interceptor;
import xyz.codedog.chapter3.game.ProxyBeanFactory;
import xyz.codedog.chapter3.game.interceptor.RoleInterceptor;
import xyz.codedog.chapter3.game.pojo.Role;
import xyz.codedog.chapter3.game.service.RoleService;
import xyz.codedog.chapter3.game.service.impl.RoleServiceImpl;

/**
 * @ClassName Chapter3Main
 * @Description Spring_第三章测试类
 * @Author panda
 * @Date 2020/4/6 上午10:05
 * @Version 1.0
 **/
public class Chapter3Main {
    @Test
    /**
     * 拦截器
     */
    public void test01() {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();
        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
        Role role = new Role(1L,"role_name_1","role_note_1");
        proxy.printRole(role);
        System.out.println("################ 测试 afterthrowing 方法 #########");
        role = null;
        proxy.printRole(role);
>>>>>>> 0a7c798348cd0f2c84324c3eb518ceccbeb865f4
    }
}
