package xyz.codedog.chapter2.el.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName ElBean
 * @Description EL
 * @Author Administrator
 * @Date 2020/4/5 17:07
 * @Version 1.0
 **/
@Component("elBean")
public class ElBean {

    //通过beanName获取bean，然后注入
    @Value("#{role}")
    private Role role;

    //获取bean的属性id
    @Value("#{role.id}")
    private Long id;

    //调用bean的getNote方法，获取角色名称
    @Value("#{role.getNote().toString()}")
    private String note;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
