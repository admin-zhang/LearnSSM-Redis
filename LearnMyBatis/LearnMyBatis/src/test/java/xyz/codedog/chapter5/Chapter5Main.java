package xyz.codedog.chapter5;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import xyz.codedog.chapter5.mapper.RoleMapper;
import xyz.codedog.chapter5.pojo.Role;
import xyz.codedog.chapter5.pojo.RoleParams;
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

}
