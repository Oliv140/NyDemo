package com.Controller;

import com.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {


    @GetMapping("/")                                    //Denne metode retunerer et template
    public String index(){
        return"home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){
        model.addAttribute("Claus", person);
//        String first_name=wr.getParameter("fname");
//        String last_name = wr.getParameter("lname");
//
//        model.addAttribute("first_name", first_name);
//        model.addAttribute("last_name", last_name);

        return "home/personData";
    }
}
