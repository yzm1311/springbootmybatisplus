package com.yy.controller;

import com.yy.pojo.User;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("test")
public class TestThyController {

    @Autowired
    private UserService service;
    @RequestMapping("getString")
    public String getString(HttpServletRequest request){
        String name = "全栈学习笔记";
        request.setAttribute("name",name);
        return "index.html";
    }

    @RequestMapping("getModel")
    public String getModel(Model model){
        model.addAttribute("key","这是一个键");
        return "index";
    }

    @GetMapping("getStudents")
    public ModelAndView getStudent(){
        List<User> students = service.list();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students",students);
        modelAndView.setViewName("index"); //设置页面叫什么
        return modelAndView;
    }
}
