package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping(path = "home")
public class UserController {
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "getUsers")
    public List<User> getUsers(){
    return userService.getUsers();
    }


    @PostMapping(path = "authentification/{emailUser}/{passwordUser}")
    @ResponseBody
    public User authentifierUser(@PathVariable("emailUser") String emailUser,@PathVariable("passwordUser") String passwordUser){
        return userService.authentifier(emailUser,passwordUser);
    }

    @PostMapping(path = "inscription")
    @ResponseBody
    public User registerNewUser(@RequestBody User user){
        return userService.inscription(user);
    }
}
