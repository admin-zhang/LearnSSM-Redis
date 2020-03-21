package xyz.codedog.chapter5.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.codedog.chapter5.pojo.Role;
import xyz.codedog.chapter5.pojo.RoleParams;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName RoleMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/21 上午10:04
 * @Version 1.0
 **/
public interface RoleMapper {
    public Role getRole(long id);
//传递多个参数
    // 使用 map 接口传递参数(不推荐)
    public List<Role> findRolesByMap(Map<String, Object> parameterMap);

    //使用注解传递多个参数(推荐)
    public List<Role> findRolesByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    //使用 JavaBean 传递多个参数
    public List<Role> findRolesByBean(RoleParams roleParams);
}
