package com.example.lovethyme.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


     @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
     }
    @RequestMapping("/processFormVersionTwo")
public String metsShoutData(HttpServletRequest request, Model model){

        // read the request parameter from html form
        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! "+theName;

        //add the message to the model
        model.addAttribute("message", result);



        return "helloworld";
}



    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        //convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! "+theName+", what's up guys?";

        //add the message to the model
        model.addAttribute("message", result);



        return "helloworld";
    }
}
