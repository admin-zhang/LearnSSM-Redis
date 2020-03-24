package xyz.codedog.chapter5.pojo;

/**
 * @ClassName FamaleEmployee
 * @Description 女雇员类
 * @Author panda
 * @Date 2020/3/23 下午7:36
 * @Version 1.0
 **/
public class FemaleEmployee extends Employee {
    private FemaleHealthForm femaleHealthForm = null;

    public FemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }
}
