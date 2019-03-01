package com.test.demo.controllers;


import com.test.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class PersonController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/person")
    public String showPersonForm(Person person) {
        return "person";
    }

    @PostMapping("/person")
    public String submitPersonForm(@Valid Person person, BindingResult bindingResult) {

        //https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/validation.html
        if (bindingResult.hasErrors()) {
            return "person";
        }
        return "redirect:/results";
    }
}
