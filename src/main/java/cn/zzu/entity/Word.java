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
    private String word;
    //音标
    private String america_pronunciation;
    //音频
    private String meaning;
    //例句

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getAmerica_pronunciation() {
        return america_pronunciation;
    }

    public void setAmerica_pronunciation(String america_pronunciation) {
        this.america_pronunciation = america_pronunciation;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}


