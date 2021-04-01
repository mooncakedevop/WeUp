package cn.zzu.controller;

import cn.zzu.entity.Word;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description: 单词界面逻辑
 * @author: mooncake
 * @create: 2021-04-01 19:30
 **/
@Controller
@RequestMapping("api")
public class wordController {
    @RequestMapping("next")
    @ResponseBody
    public Word nextWord(){
        Word word = new Word();
//        查询数据库中上次复习较久 且分数较低的单词
        return word;

    }
}
