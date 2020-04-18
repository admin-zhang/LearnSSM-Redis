package xyz.codedog.chapter12.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SqlSessionFactoryUtils
 * @Description TODO
 * @Author panda
 * @Date 2020/3/14 下午1:23
 * @Version 1.0
 **/
public class SqlSessionFactoryUtils {
    private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;
    private static SqlSessionFactory sqlsessionFactory = null;

    private SqlSessionFactoryUtils() {
    }

    public static SqlSessionFactory getSqlsessionFactory() {
        synchronized (LOCK) {
            if (sqlsessionFactory != null) {
                return sqlsessionFactory;
            }
            String resource = "xyz/codedog/chapter4/mybatis-config.xml";
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            return sqlsessionFactory;
        }
    }
    public static SqlSession openSqlSession(){
        if (sqlsessionFactory == null){
            getSqlsessionFactory();
        }
        return sqlsessionFactory.openSession();
    }
}

