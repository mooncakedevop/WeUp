package cn.zzu.entity;

/**
 * @program: demo
 * @description: 学习记录
 * @author: mooncake
 * @create: 2021-04-01 21:28
 **/
public class StudyData {
    //用户id
    private String userId;
//    单词id
    private String wordId;
//    分数（单词掌握程度）
    private String score;
//    上次复习时间
    private String last;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
