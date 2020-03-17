package xyz.codedog.chapter4.pojo;

/**
 * @EnumName SexEnum
 * @Description TODO
 * @Author panda
 * @Date 2020/3/17 下午7:26
 * @Version 1.0
 **/
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(0,  "女");


    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public SexEnum getSexById(int id){
        for (SexEnum sexEnum : SexEnum.values()){
            if (sexEnum.getId() == id){
                return sexEnum;
            }
        }
        return null;
    }
}
