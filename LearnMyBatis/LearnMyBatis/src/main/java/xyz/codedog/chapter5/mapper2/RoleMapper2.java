package xyz.codedog.chapter5.mapper2;

import xyz.codedog.chapter5.pojo2.Role2;

import java.util.List;

/**
 * @ClassName RoleMapper2
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/29 21:00
 * @Version 1.0
 **/
public interface RoleMapper2 {
    public Role2 getRole(Long id);

    public List<Role2> findRoleByUserId(Long userId);
}
