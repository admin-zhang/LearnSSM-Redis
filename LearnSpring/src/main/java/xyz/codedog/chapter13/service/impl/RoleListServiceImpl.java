package xyz.codedog.chapter13.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
@Service
public class RoleListServiceImpl implements RoleListService {
    @Autowired
    private RoleService roleService = null;
    Logger logger = Logger.getLogger(RoleListServiceImpl.class);
    @Override
    public int insertRoleList(List<Role> roleList) {
       int count = 0;
        for (Role role : roleList) {
            try {
                count += roleService.insertRole(role);
            } catch (Exception e) {
                logger.info(e);
            }
        }
        return count;
    }
}
