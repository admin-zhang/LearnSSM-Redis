package xyz.codedog.chapter1.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName JuiceMaker2
 * @Description 果汁制造器
 * @Author Administrator
 * @Date 2020/4/2 17:49
 * @Version 1.0
 **/
public class JuiceMaker3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String beverageShop = null;
    private Source source = null;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "这是一杯由：" + beverageShop + "饮品店，提供的" + source.getSize() + source.getSuger() + source.getFruit();
        return juice;
    }

    public void init() {
        System.out.println("【" + this.getClass().getSimpleName() + "】执行自定义初始化方法");
    }

    public void myDestory() {
        System.out.println("【" + this.getClass().getSimpleName() + "】执行自定义销毁方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用BeanFactoryAware接口的setBeanFactory方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用BeanNameAware接口的setBeanName方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用BeanNameAwareDisposableBean的destory方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用InitializingBean接口的afterPropertiesSet方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用ApplicationContextAware接口的setApplicationContext方法");
    }
}
