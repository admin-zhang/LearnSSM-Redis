package xyz.codedog.chapter5.pojo2;


import xyz.codedog.chapter5.pojo.SexEnum;

import java.util.List;

/**
 * @ClassName User2
 * @Description 用户POJO
 * @Author Administrator
 * @Date 2020/3/29 20:56
 * @Version 1.0
 **/
public class User2 {
    private Long id;
    private String userName;
    private SexEnum sex;
    private String mobile;
    private String email;
    private String position;
    private String note;
    //对角色一对多关联
    private List<Role2> roleList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Role2> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role2> roleList) {
        this.roleList = roleList;
    }
}
