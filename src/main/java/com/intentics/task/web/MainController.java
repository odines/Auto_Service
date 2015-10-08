package com.intentics.task.web;

import com.intentics.task.domain.Client;
import com.intentics.task.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private IClientService clientService;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getClients(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "main";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/main";
    }
}
