package xyz.codedog.chapter15.dao;

import xyz.codedog.chapter15.pojo.Role;

/**
 * @ClassName RoleDao
 * @Description
 * @Author Administrator
 * @Date 2020/5/3 16:11
 * @Version 1.0
 **/
public interface RoleDao {
    Role getRole(Long id);
}
