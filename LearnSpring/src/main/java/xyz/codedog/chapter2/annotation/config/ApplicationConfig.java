package xyz.codedog.chapter2.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import xyz.codedog.chapter2.annotation.service.impl.RoleServiceImpl;
import xyz.codedog.chapter2.pojo.Role1;

/**
 * @ClassName ApplicationConfig
 * @Description 配置@ComponentScan制定包扫描
 * @Author panda
 * @Date 2020/4/4 上午10:21
 * @Version 1.0
 **/
//@ComponentScan(basePackageClasses = {Role1.class, RoleServiceImpl.class})
@ComponentScan({"xyz.codedog.chapter2.pojo","xyz.codedog.chapter2.annotation"})
public class ApplicationConfig {
}
