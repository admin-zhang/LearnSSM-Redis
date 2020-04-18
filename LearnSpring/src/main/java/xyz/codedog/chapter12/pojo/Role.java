package xyz.codedog.chapter12.pojo;

/**
 * @ClassName Role
 * @Description 角色类
 * @Author Administrator
 * @Date 2020/4/16 19:44
 * @Version 1.0
 **/
public class Role {
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
