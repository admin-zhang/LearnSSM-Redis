package xyz.codedog.chapter3.game;

/**
 * @ClassName Intercptor
 * @Description 拦截接口
 * @Author Administrator
 * @Date 2020/4/5 17:21
 * @Version 1.0
 **/
public interface Intercptor {
    public void before(Object object);

    public void after(Object object);

    public void afterReturning(Object object);

    public void afterThrowing(Object object);
}
