package cn.zzu.entity;

/**
 * @program: demo
 * @description: 搜索结果
 * @author: mooncake
 * @create: 2021-04-09 16:08
 **/
public class SearchResult {
    private String src;
    private String dst;
    private String pron;
    private String sentence;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String pron) {
        this.pron = pron;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
