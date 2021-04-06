package cn.zzu.controller;

import cn.zzu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: demo
 * @description: 用户信息逻辑
 * @author: mooncake
 * @create: 2021-04-06 17:18
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("info")
    public User getUserInfo(@RequestParam("wechatId") String wecharId){
//        根据wechatId找到对应的userid
        User user = new User();
        user.setId("0");
        return user;
    }
}
