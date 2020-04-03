package xyz.codedog.chapter2.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName ComplexAssembly
 * @Description 集合装配类
 * @Author Administrator
 * @Date 2020/4/3 20:04
 * @Version 1.0
 **/
public class ComplexAssembly {
    private Long id;
    private List<String> list;
    private Map<String,String> map;
    private Properties properties;
    private Set<String> set;
    private String[] arrsy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getArrsy() {
        return arrsy;
    }

    public void setArrsy(String[] arrsy) {
        this.arrsy = arrsy;
    }
}
