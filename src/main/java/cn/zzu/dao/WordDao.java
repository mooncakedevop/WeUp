package cn.zzu.dao;

import cn.zzu.entity.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordDao {
//     获取当前需要背的一批的单词
     List<Word> nextBatchWord();
     List<Word> noteWords();
     void addNote(@Param("userId") String userId, @Param("wordId") int wordId, @Param("time") long time);
     void removeNote(@Param("userId") String userId, @Param("wordId") int wordId, @Param("time") long time);
}
