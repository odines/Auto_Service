package com.intentics.task.web;

import com.intentics.task.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    IClientService clientService;
    @RequestMapping(value = "client", method = RequestMethod.GET)
    public ModelAndView helloWorld(){

        ModelAndView model = new ModelAndView("client");
        model.addObject("msg", "hello world");

        return model;
    }
    @RequestMapping("/")
    public String home(){
        return "redirect:client";
    }
}
