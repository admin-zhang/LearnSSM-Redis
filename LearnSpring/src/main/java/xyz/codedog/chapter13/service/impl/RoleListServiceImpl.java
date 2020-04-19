package xyz.codedog.chapter13.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.codedog.chapter13.pojo.Role;
import xyz.codedog.chapter13.service.RoleListService;
import xyz.codedog.chapter13.service.RoleService;

import java.util.List;


/**
 * @ClassName RoleListServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/19 11:12
 * @Version 1.0
 **/
public class RoleListServiceImpl implements RoleListService {
    @Autowired
    private RoleService roleService = null;
    Logger logger = Logger.getLogger(RoleListServiceImpl.class);
    @Override
    public int insertRoleList(List<Role> roleList) {
        return 0;
    }
}
