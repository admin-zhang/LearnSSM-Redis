package xyz.codedog.chapter13.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.codedog.chapter13.mapper.RoleMapper;
import xyz.codedog.chapter13.pojo.Role;
import xyz.codedog.chapter13.service.RoleService;

/**
 * @ClassName RoleServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/19 11:12
 * @Version 1.0
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }
}
