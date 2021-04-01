package cn.zzu.controller;
import cn.zzu.entity.User;
import cn.zzu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ViewController {
    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(User user){

        Map<String,Object> map = new HashMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        User loginuser = new User(); //userService.findByUsernameAndPwd(user.getUsername(),user.getPassword());
        if(loginuser != null){
            map.put("result","success");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        return "success";
    }

}