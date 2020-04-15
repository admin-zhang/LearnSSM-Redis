package xyz.codedog.chapter3.multi.bean.impl;

import org.springframework.stereotype.Component;
import xyz.codedog.chapter3.multi.bean.MultiBean;

/**
 * @ClassName MultiBeanImpl
 * @Description 实现MultiBean接口
 * @Author Administrator
 * @Date 2020/4/15 10:00
 * @Version 1.0
 **/
@Component
public class MultiBeanImpl implements MultiBean {
    @Override
    public void testMulti() {
        System.out.println("test multi aspects!.......");
    }
}
