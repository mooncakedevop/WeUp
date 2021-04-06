package cn.zzu.controller;

import cn.zzu.entity.Word;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: 生词本逻辑
 * @author: mooncake
 * @create: 2021-04-06 17:00
 **/
@Controller
@RequestMapping("note")
public class NoteController {
    @RequestMapping("remove")
    public void removeWord(@RequestParam("userId") String userId,@RequestParam("wordId") String wordId){
//        insert一条分数为10分的该单词记录
    }

    @RequestMapping("noteWord")
    public List<Word> getNoteWord(@RequestParam("userId") String userId){
//        查询该用户所有分数为0的
        List<Word> list = new ArrayList<>();
        Word word = new Word();
        word.setId("1");
        word.setSpelling("confidence");
        word.setPron("'kɔnfidəns");

        word.setAudio("c:/confidence.mp3");
        word.setSentence("I have confidence to do anything");
        list.add(word);
        return list;

    }
}
