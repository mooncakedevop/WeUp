package cn.zzu.service.impl;

import cn.zzu.dao.UserDao;
import cn.zzu.entity.User;
import cn.zzu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vitelon on 2017-03-30
 * 用户service实现类
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    public User findByUsernameAndPwd(String name, String pwd) {

        return null;
    }

    public List<User> find(User user){

        return null;
    }


    public void add(User user) {
    }

    public void update(User user) {

    }

    public void delete(String id) {

    }
}