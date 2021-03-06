package xyz.codedog.chapter5;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import xyz.codedog.chapter5.mapper.EmployeeMapper;
import xyz.codedog.chapter5.mapper.RoleMapper;
import xyz.codedog.chapter5.mapper2.RoleMapper2;
import xyz.codedog.chapter5.mapper2.UserMapper2;
import xyz.codedog.chapter5.pojo.Employee;
import xyz.codedog.chapter5.pojo.Role;
import xyz.codedog.chapter5.pojo.RoleParams;
import xyz.codedog.chapter5.pojo2.Role2;
import xyz.codedog.chapter5.utils.SqlSessionFactoryUtils;
import xyz.codedog.chapter5.mapper.UserMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Chapter5Main
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/20 21:23
 * @Version 1.0
 **/
public class Chapter5Main {

    Logger log = Logger.getLogger(xyz.codedog.chapter5.Chapter5Main.class);
    SqlSession sqlSession = null;

    @Test
    public void testCountUserByFirstName(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int i = userMapper.countUserByFirstName("zhan");
            log.info("FirstName为zhan的共有:" + i + "个");
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void testGetRole(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(role.getRoleName());
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindRolesByMap(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Map<String, Object> parameterMap = new HashMap<>();
            parameterMap.put("roleName", "1");
            parameterMap.put("note", "1");
            List<Role> roles = roleMapper.findRolesByMap(parameterMap);
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindRolesByBean(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams roleParams = new RoleParams();
            roleParams.setRoleName("1");
            roleParams.setNote("1");
            List<Role> roles = roleMapper.findRolesByBean(roleParams);
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindByRowBounds(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RowBounds rowBounds = new RowBounds();
            List<Role> roleList = roleMapper.findByRowBounds("张三", "正", rowBounds);
            System.err.println(roleList.size());
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testInsertRole(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("李四");
            role.setNote("今天是个好日子");
            int i = roleMapper.insertRole(role);
            System.err.println("当前插入了" + i + "条数据");
            sqlSession.commit();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testGetEmployee(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            log.info(employee.getBirthday());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testGetEmployee2(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee2(1L);
            log.info(employee.getBirthday());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindRoleByUserId(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper2 roleMapper2 = sqlSession.getMapper(RoleMapper2.class);
            Role2 role = roleMapper2.getRole(1L);
            role.getUserList();
            UserMapper2 userMapper2 = sqlSession.getMapper(UserMapper2.class);
            userMapper2.getUser(1L);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    @Test
    public void testCache() {
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info("再获取一次POJO.......");
            Role role1 = roleMapper.getRole(1L);
        } catch (Exception e) {
            log.info(e.getMessage(),e);
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testCache2() {
        SqlSession sqlSession1 = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession1 = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            sqlSession.commit();
            log.info("不同sqlSession再获取一次POJO.......");
            RoleMapper roleMapper1 = sqlSession1.getMapper(RoleMapper.class);
            Role role1 = roleMapper1.getRole(1L);
            sqlSession1.commit();
        } catch (Exception e) {
            log.info(e.getMessage(),e);
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (sqlSession1 != null) {
                sqlSession1.close();
            }
        }
    }

}
