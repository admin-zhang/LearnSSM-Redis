package xyz.codedog.chapter2.profile;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @ClassName ProfileTest
 * @Description 启动Profile
 * @Author panda
 * @Date 2020/4/4 下午5:44
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ProfileDataSource.class)
@ActiveProfiles("dev")
public class ProfileTest {
    @Autowired
    private DataSource dataSource;

    public void test() {
        System.out.println(dataSource.getClass().getName());
    }
}
