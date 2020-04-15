package xyz.codedog.chapter3.multi.aspect;

import org.aspectj.lang.annotation.*;

/**
 * @ClassName Aspect1
 * @Description 切面1
 * @Author Administrator
 * @Date 2020/4/15 10:01
 * @Version 1.0
 **/
@Aspect
public class Aspect1 {
    @Pointcut("execution(* xyz.codedog.chapter3.multi.bean.impl.MultiBeanImpl.testMulti(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before 1 ......");
    }

    @After("print()")
    public void after() {
        System.out.println("after 1 .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 1.......");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning 1 .......");
    }
}
