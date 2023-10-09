package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/todo")
public class MyController {
    @RequestMapping()
    public String showFirstView(Model model){
        model.addAttribute("myCase",new ToDo());
        return "first-view";
    }
    @RequestMapping("/info")
    public String showSecondView(@ModelAttribute("myCase") ToDo todo){

        todo.setName("VIP "+todo.getName());

        return "second-view";
    }
}
