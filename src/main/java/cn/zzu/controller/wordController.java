package cn.zzu.controller;

import cn.zzu.entity.Word;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description: 单词界面逻辑
 * @author: mooncake
 * @create: 2021-04-01 19:30
 **/
@Controller
@RequestMapping("word")
public class wordController {
    @RequestMapping("next")
    @ResponseBody
    public Word nextWord(@RequestParam("userId") String id){
        Word word = new Word();
//        查询数据库中上次复习较久 且分数较低的单词
        word.setId("0");
        word.setSpelling("hello");
        word.setPron("he'ləu");
        word.setSentence("hello word");
        word.setAudio("c:/111/hello.mp3");
        return word;

    }
    @RequestMapping("addNote")
    @ResponseBody
    public void addNote(@RequestParam("userId") String userId,@RequestParam("wordId") String wordId){
//        insert 一条score为0的学习记录
    }
}
