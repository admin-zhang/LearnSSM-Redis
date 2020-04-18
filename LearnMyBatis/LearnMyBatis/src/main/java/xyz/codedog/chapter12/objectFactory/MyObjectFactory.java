package xyz.codedog.chapter12.objectFactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Properties;


/**
 * @ClassName MyObjectFactory
 * @Description TODO
 * @Author panda
 * @Date 2020/3/18 下午10:02
 * @Version 1.0
 **/
public class MyObjectFactory extends DefaultObjectFactory {
    private static final long serialVersionUID =-885512236740914948L;

    Logger logger = Logger.getLogger(MyObjectFactory.class);

    private Object temp = null;

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        logger.info("初始化参数:[" +properties.toString() + "]");
    }

//    方法2

    @Override
    public <T> T create(Class<T> type) {
        T result = super.create(type);
        logger.info("创建对象:" + result.toString());
        logger.info("是否和上次创建的是同一个对象:[" + (temp == result) + "]");
        return result;
    }

//    方法1

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        logger.info("创建对象:" + result.toString());
        temp = result;
        return  result;
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
