package xyz.codedog.chapter4.pojo;

/**
 * @ClassName TestFile
 * @Description TODO
 * @Author panda
 * @Date 2020/3/18 下午9:53
 * @Version 1.0
 **/
public class TestFile {
    long id;
    byte[] content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
