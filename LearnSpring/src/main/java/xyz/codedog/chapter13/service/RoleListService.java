package xyz.codedog.chapter13.service;

import xyz.codedog.chapter13.pojo.Role;

import java.util.List;

/**
 * @ClassName RoleListService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/19 11:12
 * @Version 1.0
 **/
public interface RoleListService {
    public int insertRoleList(List<Role> roleList);
}
