package xyz.codedog.chapter2.el.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Role
 * @Description SpringELI初始化角色类
 * @Author Administrator
 * @Date 2020/4/5 17:03
 * @Version 1.0
 **/
@Component("role")
public class Role {

    //赋值long型
    @Value("#{1}")
    private Long id;

    //字符串赋值
    @Value("#{role-name-1}")
    private String roleName;

    //字符串赋值
    @Value("#{note}")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
