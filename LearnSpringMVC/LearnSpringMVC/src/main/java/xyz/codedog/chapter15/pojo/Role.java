package xyz.codedog.chapter15.pojo;

/**
 * @ClassName Role
 * @Description 角色类
 * @Author Administrator
 * @Date 2020/5/3 16:05
 * @Version 1.0
 **/
public class Role {
    private Long id;
    private String roleName;
    private String note;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

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
