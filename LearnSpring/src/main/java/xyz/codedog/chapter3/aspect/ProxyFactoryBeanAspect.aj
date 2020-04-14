package xyz.codedog.chapter3.aspect;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class ProxyFactoryBeanAspect implements MethodBeforeAdvice {
    /**
     * 前置通知
     * @param method 被拦截方法（连接点）
     * @param params 参数 数组[role]
     * @param roleService 呗拦截对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] params, Object roleService) throws Throwable {
        System.out.println("前置通知");
    }
}
