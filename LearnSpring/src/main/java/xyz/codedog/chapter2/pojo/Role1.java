package xyz.codedog.chapter2.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Role1
 * @Description 使用注解
 * @Author panda
 * @Date 2020/4/4 上午9:53
 * @Version 1.0
 **/
@Component(value = "role")
public class Role1 {
    @Value("1")
    private Long id;
    @Value("role_name_1")
    private String roleName;
    @Value("role_note_1")
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
