package xyz.codedog.chapter2.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName ApplocationConfig
 * @Description
 * @Author Administrator
 * @Date 2020/4/4 20:06
 * @Version 1.0
 **/
@Configuration
@PropertySource(value = {"classpath:xyz/codedog/chapter2/database-config.properties"},ignoreResourceNotFound = true)
public class ApplocationConfig {

}
