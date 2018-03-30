package com.controller;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.service.UserService;


@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 测试跳转到首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    /**
     * 测试查询数据返回到页面
     * @param name
     * @return
     */
    @RequestMapping(value="/show")
    @ResponseBody
    public String show(@RequestParam(value="name")String name){
       // User user = userService.findByName(name);
        User user = userService.findByName(name);
        if(user!=null){
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        }
        else return "null";
    }
}
