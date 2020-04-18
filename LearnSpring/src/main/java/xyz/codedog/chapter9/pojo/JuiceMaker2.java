package xyz.codedog.chapter9.pojo;

/**
 * @ClassName JuiceMaker2
 * @Description 果汁制造器
 * @Author Administrator
 * @Date 2020/4/2 17:49
 * @Version 1.0
 **/
public class JuiceMaker2 {

    private String beverageShop = null;
    private Source source = null;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "这是一杯由：" + beverageShop + "饮品店，提供的" + source.getSize() + source.getSuger() + source.getFruit();
        return juice;
    }
}
