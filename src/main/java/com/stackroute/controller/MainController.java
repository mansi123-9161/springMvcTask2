package com.stackroute.controller;

import com.stackroute.module.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        return "welcome";
    }
    @RequestMapping(value = "/success")
    public String success(@RequestParam("username")String username,@RequestParam("password")String passsword, ModelMap map){
        User user=new User();
        user.setName(username);
        map.addAttribute("user",user.getName());
        return "success";
    }

}
