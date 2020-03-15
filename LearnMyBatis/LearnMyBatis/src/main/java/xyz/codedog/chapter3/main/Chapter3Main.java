package xyz.codedog.chapter3.main;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import xyz.codedog.chapter3.mapper.RoleMapper;
import xyz.codedog.chapter3.pojo.Role;
import xyz.codedog.chapter3.utils.SqlSessionFactoryUtils;

public class Chapter3Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Chapter3Main.class);
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
