package xyz.codedog.chapter4.mapper;

import xyz.codedog.chapter4.pojo.Role;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/17 下午6:57
 * @Version 1.0
 **/
public interface RoleMapper {
    public Role getRole(Long id);

    public List<Role> findRoles(String roleName);

    public List<Role> findRoles2(String note);


}
