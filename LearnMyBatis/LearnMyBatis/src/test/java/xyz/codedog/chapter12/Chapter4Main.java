package xyz.codedog.chapter12;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import xyz.codedog.chapter12.mapper.RoleMapper;
import xyz.codedog.chapter12.mapper.UserMapper;
import xyz.codedog.chapter12.pojo.Role;
import xyz.codedog.chapter12.pojo.User;
import xyz.codedog.chapter12.utils.SqlSessionFactoryUtils;

/**
 * @ClassName Chapter4Main
 * @Description TODO
 * @Author panda
 * @Date 2020/3/18 下午10:11
 * @Version 1.0
 **/
public class Chapter4Main {

    Logger log = Logger.getLogger(xyz.codedog.chapter12.Chapter4Main.class);
    SqlSession sqlSession = null;

    @Test
    public void testRoleMapper(){
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(((Role) role).getRoleName());
            log.info(role.getNote());
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void testUserMapper() {
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1L);
            log.info(user.getSexEnum().getName());
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
