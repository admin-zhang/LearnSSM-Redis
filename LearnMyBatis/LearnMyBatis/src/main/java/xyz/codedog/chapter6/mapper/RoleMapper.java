package xyz.codedog.chapter6.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.codedog.chapter6.pojo.Role;

import javax.management.relation.RoleList;
import java.util.List;

/**
 * @InterfaceName RoleMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/30 下午7:26
 * @Version 1.0
 **/
public interface RoleMapper {
    public List<Role> findRoles(@Param("roleName") String roleName);

    public List<Role> findRoles1(Role role);

    public List<Role> findRoles3(Role role);

    public List<Role> findRoles4(@Param("roleName") String roleName);

    public List<Role> findRoles5(String roleName);

    public List<Role> findRoles6(@Param("roleName") String roleName, @Param("note") String note);

    public int updateRoles(Role role);

    public List<Role> findRoleByNums(@Param("roleNoList") List<String> roleNoList);

    public List<Role> getRoleTest(@Param("type") String type);
}
