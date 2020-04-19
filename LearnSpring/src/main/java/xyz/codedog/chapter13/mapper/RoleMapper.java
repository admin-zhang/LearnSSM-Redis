package xyz.codedog.chapter13.mapper;

import org.springframework.stereotype.Repository;
import xyz.codedog.chapter13.pojo.Role;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/19 11:11
 * @Version 1.0
 **/
@Repository
public interface RoleMapper {
    public int insertRole(Role role);
}
