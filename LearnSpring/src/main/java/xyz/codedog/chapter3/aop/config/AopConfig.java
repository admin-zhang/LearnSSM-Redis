package xyz.codedog.chapter3.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import xyz.codedog.chapter3.aop.aspect.RoleAspect;

/**
 * @ClassName AopConfig
 * @Description 配置Spring bean
 * @Author Administrator
 * @Date 2020/4/12 18:31
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy //启用AspectJ框架的自动代理
@ComponentScan("xyz.codedog.chapter3.aop")
public class AopConfig {

    @Bean
    public RoleAspect getRoleAspect() {
        return new RoleAspect();
    }
}
