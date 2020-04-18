package xyz.codedog.chapter11.aop.verifier;

import xyz.codedog.chapter11.game.pojo.Role;

/**
 * @ClassName RoleVerifier
 * @Description Role检测器
 * @Author Administrator
 * @Date 2020/4/12 20:21
 * @Version 1.0
 **/
public interface RoleVerifier {
    public boolean verify(Role role);
}
