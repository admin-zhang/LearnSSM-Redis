package xyz.codedog.chapter12;

import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import xyz.codedog.chapter12.dao.RoleDao;
import xyz.codedog.chapter12.pojo.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName chapter12Main
 * @Description Spring第四章测试类
 * @Author Administrator
 * @Date 2020/4/16 19:41
 * @Version 1.0
 **/
public class chapter12Main {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter12/applicationContext01.xml");
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

    @Test
    public void testJdbcTemplate01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter12/applicationContext01.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        RoleDao roleDao = (RoleDao) applicationContext.getBean("roleDao");
        System.out.println("插入数据");
        roleDao.insertRole(jdbcTemplate);
        System.out.println("插入完成");
        List roleList = roleDao.findRole(jdbcTemplate, "role");
        System.out.println(roleList.size());
        Role role = new Role();
        role.setId(8L);
        role.setRoleName("update_role_name_1");
        role.setNote("update_note_1");
        System.out.println("开始更新数据");
        roleDao.updateRole(jdbcTemplate, role);
        System.out.println("数据更新完成");
        System.out.println("开始删除数据");
        roleDao.deleteRole(jdbcTemplate, 3L);
        System.out.println("数据删除完成");
        System.out.println("ConnectionCallback接口");
        roleDao.getRoleByConnectionCallback(jdbcTemplate, 1L);
        System.out.println("StatementCallback接口");
        roleDao.getRoleStatementCallback(jdbcTemplate, 2L);
    }

    @Test
    public void testSqlSessionTemplate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xyz/codedog/chapter12/applicationContext01.xml");
        SqlSessionTemplate sqlSessionTemplate = applicationContext.getBean(SqlSessionTemplate.class);
        Role role = new Role();
        role.setRoleName("role_name_sqlSessionTemplate");
        role.setNote("note_sqlSessionTemplate");
        System.out.println("插入数据");
        sqlSessionTemplate.insert("xyz.codedog.chapter12.mapper.RoleIMapper.insertRole", role);
        System.out.println("查找数据");
        Long id = role.getId();
        sqlSessionTemplate.selectOne("xyz.codedog.chapter12.mapper.RoleIMapper.getRole1", id);
        System.out.println("更新数据");
        role.setNote("update_sqlSessionTemplate");
        sqlSessionTemplate.update("xyz.codedog.chapter12.mapper.RoleIMapper.updateRole",role);
        System.out.println("删除数据");
        sqlSessionTemplate.delete("xyz.codedog.chapter12.mapper.RoleIMapper.deleteRole", id);
    }

}
