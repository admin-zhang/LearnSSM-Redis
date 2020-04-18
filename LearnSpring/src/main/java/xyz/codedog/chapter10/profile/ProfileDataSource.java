package xyz.codedog.chapter10.profile;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @ClassName ProfileDataSource
 * @Description 注解@Profile
 * @Author panda
 * @Date 2020/4/4 下午5:18
 * @Version 1.0
 **/
@Component
public class ProfileDataSource {

    @Bean(name = "devDataSource")
    @Profile("dev")
    public DataSource getDataSource() {
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.cj.jdbc.driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/ssm");
        properties.setProperty("username", "panda");
        properties.setProperty("password", "panda174510");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean(name = "testDataSource")
    @Profile("test")
    public DataSource getTestDataSource(){
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.cj.jdbc.driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/ssm");
        properties.setProperty("username", "panda");
        properties.setProperty("password", "panda174510");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
