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
    private String realName;
    private SexEnum sex;
    private String moble;
    private String email;
    private String note;
    //对角色一对多关联
    private List<Role2> role2List;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getMoble() {
        return moble;
    }

    public void setMoble(String moble) {
        this.moble = moble;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Role2> getRole2List() {
        return role2List;
    }

    public void setRole2List(List<Role2> role2List) {
        this.role2List = role2List;
    }
}
