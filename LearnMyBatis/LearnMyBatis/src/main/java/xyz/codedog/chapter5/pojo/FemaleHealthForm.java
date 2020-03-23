package xyz.codedog.chapter5.pojo;

/**
 * @ClassName FemaleHealthForm
 * @Description 女性体检表
 * @Author panda
 * @Date 2020/3/23 下午6:55
 * @Version 1.0
 **/
public class FemaleHealthForm extends HealthForm{
    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
