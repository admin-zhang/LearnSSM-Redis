package xyz.codedog.chapter3.multi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import xyz.codedog.chapter3.multi.aspect.Aspect1;
import xyz.codedog.chapter3.multi.aspect.Aspect2;
import xyz.codedog.chapter3.multi.aspect.Aspect3;

/**
 * @ClassName MultiConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/15 10:07
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("xyz.codedog.chapter3.multi")
public class MultiConfig {

    @Bean
    public Aspect1 getAspect1() {
        return new Aspect1();
    }

    @Bean
    public Aspect2 getAspect2() {
        return new Aspect2();
    }

    @Bean
    public Aspect3 getAspect3() {
        return new Aspect3();
    }
}
