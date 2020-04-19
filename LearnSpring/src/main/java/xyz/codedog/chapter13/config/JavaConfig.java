package xyz.codedog.chapter13.config;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @ClassName JavaConfig
 * @Description 使用Java配置Spring数据库事务
 * @Author Administrator
 * @Date 2020/4/19 10:00
 * @Version 1.0
 **/
@Configuration
@ComponentScan("xyz.codedog.chapter13.*")
//使用事务驱动管理器
@EnableTransactionManagement
public class JavaConfig implements TransactionManagementConfigurer {

    //数据源
    private DataSource dataSource = null;

    @Bean(name = "dataSource")
    public DataSource initDataSource() {
        if (dataSource != null) {
            return dataSource;
        }
        Properties properties = new Properties();
        properties.setProperty("driverClassName", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC");
        properties.setProperty("username", "panda");
        properties.setProperty("password", "panda174510");
        properties.setProperty("maxActive", "200");
        properties.setProperty("maxIdle", "20");
        properties.setProperty("maxWait", "30000");
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    /**
     * 配置JdbcTemplate
     * @return
     */
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate initJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(initDataSource());
        return jdbcTemplate;
    }

    /**
     * 实现接口方法，使得返回数据库事务管理器
     * @return
     */
    @Override
    @Bean(name = "transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //设置事务管理器管理的数据源
        transactionManager.setDataSource(initDataSource());
        return transactionManager;
    }
}
