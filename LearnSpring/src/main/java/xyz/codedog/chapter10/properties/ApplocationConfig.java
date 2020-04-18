package xyz.codedog.chapter10.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @ClassName ApplocationConfig
 * @Description
 * @Author Administrator
 * @Date 2020/4/4 20:06
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = {"xyz.codedog.chapter10.properties"})
@PropertySource(value = {"classpath:xyz/codedog/chapter2/database-config.properties"},ignoreResourceNotFound = true)
public class ApplocationConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
