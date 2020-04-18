package xyz.codedog.chapter9;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.codedog.chapter9.pojo.JuiceMaker2;
import xyz.codedog.chapter9.pojo.JuiceMaker3;

/**
 * @ClassName Chapter1Main
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/2 18:17
 * @Version 1.0
 **/
public class Chapter9Main {
    private static final String resources = "xyz/codedog/chapter1/applicationContext.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resources);
    @Test
    public void test01(){
        JuiceMaker2 juiceMaker2 = (JuiceMaker2) applicationContext.getBean("juiceMaker2");
        System.out.println(juiceMaker2.makeJuice());
    }

    @Test
    public void test02(){
        JuiceMaker3 juiceMaker3 = (JuiceMaker3) applicationContext.getBean("juiceMaker3");
        System.out.println(juiceMaker3.makeJuice());
    }
}
