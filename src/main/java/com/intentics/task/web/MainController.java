package com.intentics.task.web;

import com.intentics.task.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    IClientService clientService;
    @RequestMapping("/index")
    public String listClients(Model model) {

        model.addAttribute("user", "lalka");
        /*
        model.addAttribute("client", new Client());

        map.put("client", new Client());
        map.put("clientList", clientService.getAllClients());
        */
        return "client";
    }
    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }
}
