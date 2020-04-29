package xyz.codedog.chapter14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName MyController
 * @Description 这是一个简单的Controller
 * @Author Administrator
 * @Date 2020/4/26 22:27
 * @Version 1.0
 **/
//注解 @Controller 表明这是一个控制器
@Controller("myController")
//表明当请求的URI在/my下的时候才有控制器响应
@RequestMapping("/my")
public class MyController {
    //表明URI是 /index的时候该方法才请求
    @RequestMapping(path = "/index",method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index() {
        //模型和视图
        ModelAndView modelAndView = new ModelAndView();
        //视图逻辑名称
        modelAndView.setViewName("index");
        //返回模型和视图
        return modelAndView;
    }
}
