package xyz.codedog.chapter3.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import xyz.codedog.chapter3.aop.verifier.RoleVerifier;
import xyz.codedog.chapter3.aop.verifier.impl.RoleVerifierImpl;

/**
 * @ClassName RoleAspect
 * @Description 角色类切面
 * @Author Administrator
 * @Date 2020/4/12 18:05
 * @Version 1.0
 **/
@Aspect
public class RoleAspect {

    @DeclareParents(value = "xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl+",defaultImpl = RoleVerifierImpl.class)
    public RoleVerifier roleVerifier;

  /*  @Before("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))" + "&& args(role,sort)")
    public void before(Role role,int sort){
        System.out.println("before ....");
    } */

    @Before("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void before(){
        System.out.println("before ....");
    }

    @After("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void after() {
        System.out.println("after ....");
    }

    @AfterReturning("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterReturing() {
        System.out.println("afterReturing ...");
    }

    @AfterThrowing("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing ....");
    }

    @Around("execution(* xyz.codedog.chapter3.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("around before ....");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after ....");

    }
}
