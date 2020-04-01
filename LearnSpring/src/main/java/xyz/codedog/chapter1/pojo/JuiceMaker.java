package xyz.codedog.chapter1.pojo;

/**
 * @ClassName JuiceMaker
 * @Description 果汁生成器
 * @Author panda
 * @Date 2020/4/1 下午5:57
 * @Version 1.0
 **/
public class JuiceMaker {
    private Blender blender = null;
    private String water;
    private String fruit;
    private String suger;

    public Blender getBlender() {
        return blender;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSuger() {
        return suger;
    }

    public void setSuger(String suger) {
        this.suger = suger;
    }

    /**
     * 果汁生成
     * @return
     */
    public String makeJuice() {
        blender = new Blender();
        return blender.mix(water, fruit, suger);
    }
}
