package xyz.codedog.chapter15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import xyz.codedog.chapter15.pojo.Role;
import xyz.codedog.chapter15.pojo.RoleParams;
import xyz.codedog.chapter15.service.RoleService;

/**
 * @ClassName ParamsController
 * @Description 接收参数的控制器
 * @Author Administrator
 * @Date 2020/4/30 9:55
 * @Version 1.0
 **/
@Controller
@RequestMapping("/Params")
public class ParamsController {
    /**
     * 无注解获取HTTP请求参数
     * @param roleName
     * @param note
     * @return
     */
    @RequestMapping("/commonParams")
    public ModelAndView commonParams(String roleName, String note) {
        System.out.println("roleName => " + roleName);
        System.out.println("note => " + note);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("role");
        return modelAndView;
    }

    @RequestMapping("/commonParamPojo")
    public ModelAndView commonParamPojo(RoleParams roleParams) {
        System.out.println("roleName1 => " + roleParams.getRoleName());
        System.out.println("note1 => " + roleParams.getNote());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("role");
        return modelAndView;
    }

    @RequestMapping("/requestParam")
    public ModelAndView requestParam(@RequestParam("role_name") String roleName,String note){
        System.out.println("roleName2 => " + roleName);
        System.out.println("note2 => " + note);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("role");
        return modelAndView;
    }

    //注入角色服务对象
    @Autowired
    RoleService roleService;

    //{id}代表接收一个参数
    @RequestMapping("/getRole/{id}")
    //注解@PathVariable表示从URL的请求地址中获取参数
    public ModelAndView pathVariable(@PathVariable("id") Long id) {
        Role role = roleService.getRole(id);
        ModelAndView modelAndView = new ModelAndView();
        //绑定数据模型
        modelAndView.addObject(role);
        //设置JSON视图
        modelAndView.setView(new MappingJackson2JsonView());
        return modelAndView;
    }
}
