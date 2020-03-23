package xyz.codedog.chapter5.pojo;

/**
 * @ClassName MaleHealthForm
 * @Description 男性体检表
 * @Author panda
 * @Date 2020/3/23 下午6:56
 * @Version 1.0
 **/
public class MaleHealthForm extends HealthForm {
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
