package xyz.codedog.chapter10.annotation.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName ApplicationConfig
 * @Description 配置@ComponentScan制定包扫描
 * @Author panda
 * @Date 2020/4/4 上午10:21
 * @Version 1.0
 **/
//@ComponentScan(basePackageClasses = {Role1.class, RoleServiceImpl.class})
@ComponentScan({"xyz.codedog.chapter10.pojo", "xyz.codedog.chapter10.annotation"})
public class ApplicationConfig {
}
