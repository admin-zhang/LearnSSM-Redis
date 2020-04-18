package xyz.codedog.chapter11.multi.aspect;

import org.aspectj.lang.annotation.*;

/**
 * @ClassName Aspect1
 * @Description 切面1
 * @Author Administrator
 * @Date 2020/4/15 10:01
 * @Version 1.0
 **/
@Aspect
public class Aspect3 {
    @Pointcut("execution(* xyz.codedog.chapter11.multi.bean.impl.MultiBeanImpl.testMulti(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before 3 ......");
    }

    @After("print()")
    public void after() {
        System.out.println("after 3 .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 3 .......");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning 3 .......");
    }
}
