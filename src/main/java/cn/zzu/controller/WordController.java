package cn.zzu.controller;

import cn.zzu.dao.WordDao;
import cn.zzu.entity.Word;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import util.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: 单词界面逻辑
 * @author: mooncake
 * @create: 2021-04-01 19:30
 **/
@Controller
@RequestMapping("/word")
public class WordController {
    @RequestMapping("/next")
    @ResponseBody
    public List<Word> nextWord(@RequestParam("userId") String id){
        SqlSession session = MyBatisUtil.getSqlsession();
        //5、使用SqlSession创建dao接口的代理对象
        WordDao wordDao = session.getMapper(WordDao.class);
        //6、使用代理对象执行查询所有方法
        List<Word> words = wordDao.nextBatchWord();
        session.close();
        return words;

    }
    @RequestMapping("/addNote")
    @ResponseBody
    public void addNote(@RequestParam("userId") String userId,@RequestParam("wordId") String wordId){
//        insert 一条score为0的学习记录
        SqlSession session = MyBatisUtil.getSqlsession();
        //5、使用SqlSession创建dao接口的代理对象
        WordDao wordDao = session.getMapper(WordDao.class);
        //6、使用代理对象执行查询所有方法
        System.currentTimeMillis();
        wordDao.addNote(userId,Integer.parseInt(wordId),System.currentTimeMillis());
        session.close();
    }
    @RequestMapping("/removeNote")
    @ResponseBody
    public void removeNote(@RequestParam("userId") String userId,@RequestParam("wordId") String wordId){
//        移出生词
        SqlSession session = MyBatisUtil.getSqlsession();
        WordDao wordDao = session.getMapper(WordDao.class);
        wordDao.removeNote(userId,Integer.parseInt(wordId),System.currentTimeMillis());
        session.close();
    }


    @ResponseBody
    @RequestMapping("/notewords")
    public List<Word> getNoteList(@RequestParam("userId") String id){
        SqlSession session = MyBatisUtil.getSqlsession();
        //5、使用SqlSession创建dao接口的代理对象
        WordDao wordDao = session.getMapper(WordDao.class);
        //6、使用代理对象执行查询所有方法
        List<Word> noteWords = wordDao.noteWords();
        session.close();
        return noteWords;
    }
}
