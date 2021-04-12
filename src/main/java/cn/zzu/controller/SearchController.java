package cn.zzu.controller;

import cn.zzu.entity.SearchResult;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Timestamp;

/**
 * @program: demo
 * @description: 搜索接口
 * @author: mooncake
 * @create: 2021-04-09 16:06
 **/
@Controller
@RequestMapping("api")
public class SearchController {
    public String getSign(String input){
        String sign = "";
        String curtime = "";
        String key = "2c92f34f26450bad"+input+"324"+curtime+"d7S4RUAU9OUQXgUK0TzLrqtgwM8pRzW2";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(key.getBytes("UTF-8"));
            sign = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sign;
    }
    @RequestMapping("search")
    public SearchResult search(@RequestParam("input") String input){


        SearchResult result = new SearchResult();
        return result;
    }

}
