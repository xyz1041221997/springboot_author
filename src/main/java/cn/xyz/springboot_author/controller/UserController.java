package cn.xyz.springboot_author.controller;

import cn.xyz.springboot_author.dao.UserDao;
import cn.xyz.springboot_author.entity.User;
import cn.xyz.springboot_author.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
     @Autowired
    UserService userService;

     @GetMapping("doLogin")
    public User findByUsernameAndAndPassword(User user){
        return   userService.findUser(user);
    }

}
