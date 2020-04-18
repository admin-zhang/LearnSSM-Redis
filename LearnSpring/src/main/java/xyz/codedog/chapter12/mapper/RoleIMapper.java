package xyz.codedog.chapter12.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.codedog.chapter12.pojo.Role;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/18 20:42
 * @Version 1.0
 **/
//@Repository
public interface RoleIMapper {
    public int insertRole(Role role);

    public Role getRole1(@Param("id") Long id);

    public int updateRole(Role role);

    public int deleteRole(@Param("id") Long id);
}
