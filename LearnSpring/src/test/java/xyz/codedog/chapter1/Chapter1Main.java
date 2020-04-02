package xyz.codedog.chapter1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.codedog.chapter1.pojo.JuiceMaker2;

/**
 * @ClassName Chapter1Main
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/2 18:17
 * @Version 1.0
 **/
public class Chapter1Main {
    private static final String resources = "xyz/codedog/chapter1/applicationContext.xml";
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resources);
        JuiceMaker2 juiceMaker2 = (JuiceMaker2) applicationContext.getBean("juiceMaker2");
        System.out.println(juiceMaker2.makeJuice());
    }
}
