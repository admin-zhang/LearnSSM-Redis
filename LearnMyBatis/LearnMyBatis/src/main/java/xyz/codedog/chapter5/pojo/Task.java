package xyz.codedog.chapter5.pojo;

/**
 * @ClassName Task
 * @Description 任务表
 * @Author panda
 * @Date 2020/3/23 下午7:00
 * @Version 1.0
 **/
public class Task {
    private Long id;
    private String title;
    private String context;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
