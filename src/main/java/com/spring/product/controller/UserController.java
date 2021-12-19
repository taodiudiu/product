package com.spring.product.controller;

import com.spring.product.pojo.User;
import com.spring.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
//import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService = null;

    @RequestMapping("/GetUserById/{id}")
    public Map<String,Object> GetUserById(@PathVariable int id){
        User user = userService.GetUserById(id);
//        Optional<String> userStream
        if(user == null){
            return GetResult(false,"User is null");
        }
        else {
            return GetResult(true,user);
        }
    }

    @RequestMapping("/insert/{userName}/{note}")
    public Map<String,Object> InserUser(@PathVariable String userName,@PathVariable String note){
        User user = new User(userName,note);
        int insert = userService.InserUser(user);
        return GetResult(true,insert);
    }

    @RequestMapping("/test")
    public String test(){
        return "Controller is OK";
    }

    private Map<String,Object> GetResult(Boolean res,Object obj){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("success",res);
        result.put("value",obj);
        return result;
    }
}
