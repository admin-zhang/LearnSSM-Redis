package xyz.codedog.chapter1.pojo;

/**
 * @ClassName Blender
 * @Description 搅拌机
 * @Author panda
 * @Date 2020/4/1 下午5:54
 * @Version 1.0
 **/
public class Blender {
    /**
     * 搅拌
     * @param water
     * @param fruit
     * @param suger
     * @return
     */
    public String mix(String water, String fruit, String suger) {
        String juice = "这是一杯由液体: " + water + "\n 水果: " + fruit + "\n 糖量: " + suger + "\n 组成的果汁";
        return juice;
    }
}
