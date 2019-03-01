package com.test.demo.controllers;

import com.test.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private Person person;

    public UserController() {
        person = new Person();
    }

    /**
     * This mapping is expecting the url to be http://localhost:8080/greeting?name=Brett
     *
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "user") String name,
                           Model model) {
        person.setName(name);
        model.addAttribute("name", name);
        return "greeting";
    }

    /**
     * This mapping is expecting the url to be http://localhost:8080/rename?name=Brett&age=80
     * @param age
     * @param model
     * @return
     */
    @GetMapping("/rename")
    public String rename(@RequestParam(name = "age", required = false, defaultValue = "0") int age, Model model) {
        String name = person.getName();
        model.addAttribute("age", age);
        model.addAttribute("name", name);
        return "rename";
    }
}
