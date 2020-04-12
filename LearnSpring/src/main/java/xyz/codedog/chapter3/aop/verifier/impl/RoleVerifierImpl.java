package xyz.codedog.chapter3.aop.verifier.impl;

import xyz.codedog.chapter3.aop.verifier.RoleVerifier;
import xyz.codedog.chapter3.game.pojo.Role;

/**
 * @ClassName RoleVerifierImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/12 20:22
 * @Version 1.0
 **/
public class RoleVerifierImpl implements RoleVerifier {
    @Override
    public boolean verify(Role role) {
        return role != null;
    }
}
