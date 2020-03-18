package xyz.codedog.chapter4.main;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import xyz.codedog.chapter4.mapper.RoleMapper;
import xyz.codedog.chapter4.mapper.UserMapper;
import xyz.codedog.chapter4.pojo.Role;
import xyz.codedog.chapter4.pojo.User;
import xyz.codedog.chapter4.utils.SqlSessionFactoryUtils;


/**
 * @ClassName Chapter4Main
 * @Description TODO
 * @Author panda
 * @Date 2020/3/17 下午7:09
 * @Version 1.0
 **/
public class Chapter4Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Chapter4Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Role role = roleMapper.getRole(1L);
            User user = userMapper.getUser(1L);
            System.out.println("role==================");
            log.info(((Role) role).getRoleName());
            System.out.println("user==================");
            log.info(user.getSexEnum().getName());
            log.info(role.getNote());
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
