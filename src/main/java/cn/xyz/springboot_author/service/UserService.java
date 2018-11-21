package cn.xyz.springboot_author.service;

import cn.xyz.springboot_author.dao.UserDao;
import cn.xyz.springboot_author.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User findUser(User user){
        return userDao.findByUsernameAndAndPassword(user);
    }
}
