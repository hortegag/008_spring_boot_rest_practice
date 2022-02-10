package com.kata.budgetplanner.controller;


import com.kata.budgetplanner.repository.IdentificationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private transient IdentificationTypeRepository identificationTypeRepository;


    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return identificationTypeRepository.findAll()
                                           .toString();


    }


}
