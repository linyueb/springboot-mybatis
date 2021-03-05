package com.lyue.controller;


import com.lyue.entity.User;
import com.lyue.service.UserService;
import com.lyue.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public Response GetUser(@PathVariable int id){
        User user = userService.Sel(id);
        return Response.buildSuccess(user);
    }

    @RequestMapping("/all")
    public Response All(){
        List<User> users = userService.All("id,username");
        return Response.buildSuccess(users);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Response Insert(){
        User user = new User();
        user.setUserName("笑问天");
        user.setPhone("18825262288");
        userService.Insert(user);
        return Response.buildSuccess();
    }

}
