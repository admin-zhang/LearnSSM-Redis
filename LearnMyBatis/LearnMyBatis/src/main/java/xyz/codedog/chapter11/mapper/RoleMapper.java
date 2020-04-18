package xyz.codedog.chapter11.mapper;

import xyz.codedog.chapter11.pojo.Role;

import java.util.List;

/**
 * @author panda
 */
public interface RoleMapper {
    /**
     * 添加
     * @param role
     * @return
     */
    int insertRole(Role role);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    public int deleteRole(Long id);

    public int updateRole(Role role);

    public Role getRole(Long id);

    public List<Role> findRoles(String roleName);



}
