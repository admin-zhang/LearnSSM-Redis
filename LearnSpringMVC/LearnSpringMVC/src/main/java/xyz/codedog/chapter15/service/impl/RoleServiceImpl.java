package xyz.codedog.chapter15.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.codedog.chapter15.dao.RoleDao;
import xyz.codedog.chapter15.pojo.Role;
import xyz.codedog.chapter15.service.RoleService;

/**
 * @ClassName RoleServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/5/3 16:08
 * @Version 1.0
 **/
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getRole(Long id) {
        return roleDao.getRole(id);
    }
}
