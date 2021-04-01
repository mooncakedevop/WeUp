package cn.zzu.controller;

import cn.zzu.entity.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description: 返回json demo
 * @author: mooncake
 * @create: 2021-04-01 17:37
 **/
@Controller
@RequestMapping("/api")
public class JsonController {
    @RequestMapping("/data")
    @ResponseBody
    public Data find(@RequestParam("dict") String dict){
        Data data = new Data();
        data.setDict(dict);
        data.setName("肖航");
        data.setIntro("小纯洁");

        return data;
    }

}
