package xyz.codedog.chapter6.pojo;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Description TODO
 * @Author panda
 * @Date 2020/3/21 上午10:01
 * @Version 1.0
 **/
public class Role implements Serializable {
    public static final long serialVersionUID = 598736524547906734L;
    private Long id;
    private String roleName;
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
