package xyz.codedog.chapter3.game;

/**
 * @ClassName ProxyBeanFactory
 * @Description TODO
 * @Author panda
 * @Date 2020/4/5 下午6:19
 * @Version 1.0
 **/
public class ProxyBeanFactory {
    public static <T> T getBean(T obj, Interceptor interceptor) {
        return (T) ProxyBeanUtil.getBean(obj, interceptor);
    }
}
