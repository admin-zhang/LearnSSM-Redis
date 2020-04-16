package xyz.codedog.chapter4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import xyz.codedog.chapter4.pojo.Role;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName Chapter4Main
 * @Description Spring第四章测试类
 * @Author Administrator
 * @Date 2020/4/16 19:41
 * @Version 1.0
 **/
public class Chapter4Main {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter4/applicationContext01.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        Long id = 1L;
        String sql = "select id,role_name,note from t_role where id = " + id;
        Role role = jdbcTemplate.queryForObject(sql, new RowMapper<Role>() {
            @Override
            public Role mapRow(ResultSet rs, int rownum) throws SQLException {
                Role result = new Role();
                result.setId(rs.getLong("id"));
                result.setRoleName(rs.getString("role_name"));
                result.setNote(rs.getString("note"));
                return result ;
            }
        });
        System.out.println(role.getRoleName());
    }
}
