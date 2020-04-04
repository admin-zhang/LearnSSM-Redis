package xyz.codedog.chapter2.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @ClassName ProfileTest
 * @Description 启动Profile
 * @Author panda
 * @Date 2020/4/4 下午5:44
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(Classes=ProfileDataSource.class)
@ActiveProfiles("dev")
public class ProfileTest {
    @Autowired
    private DataSource dataSource;

    public void test() {
        System.out.println(dataSource.getClass().getName());
    }
}
