package xyz.codedog.chapter3;

import org.junit.Test;
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
    }
}
