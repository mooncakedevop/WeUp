package cn.zzu.controller;

import cn.zzu.entity.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import util.RequestURL;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description: 用户信息逻辑
 * @author: mooncake
 * @create: 2021-04-06 17:18
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/getOpenId")
    public String getOpenId(@RequestParam("code") String code){
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        url += "?appid=wxff2fe12561239f23";//自己的appid
        url += "&secret=f949312022cc010455c0602cc1849895";//密匙
        url += "&js_code=" + code;
        url += "&grant_type=authorization_code";
        String res = RequestURL.doGet(url);
        JSONObject jo = JSON.parseObject(res);
        String openid = jo.getString("openid");
        return openid;
    }


    @RequestMapping("info")
    @ResponseBody
    public User getUserInfo(@RequestParam("wechatId") String wecharId) {
//        根据wechatId找到对应的userid
        User user = new User();
        user.setId("0");
        return user;
    }
}
