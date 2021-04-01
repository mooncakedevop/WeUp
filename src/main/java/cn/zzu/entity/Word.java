package cn.zzu.entity;

/**
 * @program: demo
 * @description: 单词实体类
 * @author: mooncake
 * @create: 2021-04-01 19:32
 **/
public class Word {
    private String id;
    //拼写
    private String spelling;
    //音标
    private String pron;
    //音频
    private String audio;
    //例句
    private String sentence;
    // 上次记忆时间
    private String last;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String pron) {
        this.pron = pron;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
