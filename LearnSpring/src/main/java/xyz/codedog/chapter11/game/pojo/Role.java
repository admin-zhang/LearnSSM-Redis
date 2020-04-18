package xyz.codedog.chapter11.game.pojo;

/**
 * @ClassName Role
<<<<<<< HEAD
 * @Description 角色类
 * @Author Administrator
 * @Date 2020/4/12 18:00
=======
 * @Description Role
 * @Author panda
 * @Date 2020/4/5 下午6:23
>>>>>>> 0a7c798348cd0f2c84324c3eb518ceccbeb865f4
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
