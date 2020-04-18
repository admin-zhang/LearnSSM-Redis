package xyz.codedog.chapter11.xml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName XmlAspect
 * @Description 切面类
 * @Author Administrator
 * @Date 2020/4/13 10:41
 * @Version 1.0
 **/
public class XmlAspect {
    public void before() {
        System.out.println("before ....");
    }

   /* public void before(Role role) {
        System.out.println("role_id = " + role.getId() + "before ......");
    }*/

    public void after() {
        System.out.println("after ....");
    }

    public void afterThrowing() {
        System.out.println("after-throwing .....");
    }

    public void afterReturning() {
        System.out.println("after-returning .....");
    }

    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("around before ....");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            new RuntimeException("回调原有流程，产生异常.....");
        }
        System.out.println("around after ....");
    }
}
