package xyz.codedog.chapter5.pojo;

/**
 * @ClassName MaleEmployee
 * @Description 男雇员类
 * @Author panda
 * @Date 2020/3/23 下午7:35
 * @Version 1.0
 **/
public class MaleEmployee extends Employee {
    private MaleHealthForm maleHealthForm = null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
