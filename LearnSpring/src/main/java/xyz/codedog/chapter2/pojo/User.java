package xyz.codedog.chapter2.pojo;

/**
 * @ClassName User
 * @Description User类
 * @Author Administrator
 * @Date 2020/4/3 20:11
 * @Version 1.0
 **/
public class User {
    private Long id;
    private String userName;
    private String note;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
