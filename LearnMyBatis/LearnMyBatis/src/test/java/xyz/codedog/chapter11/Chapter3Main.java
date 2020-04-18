package xyz.codedog.chapter11;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import xyz.codedog.chapter11.mapper.RoleMapper;
import xyz.codedog.chapter11.pojo.Role;
import xyz.codedog.chapter11.utils.SqlSessionFactoryUtils;

/**
 * @ClassName Chapter3Main
 * @Description TODO
 * @Author panda
 * @Date 2020/3/18 下午10:11
 * @Version 1.0
 **/
public class Chapter3Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(xyz.codedog.chapter11.Chapter3Main.class);
        SqlSession sqlSession = null;
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
}
