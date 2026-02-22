package com.xworkz.register.controller;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String register(RegisterDTO dto, Model model) {

        boolean valid = registerService.registerValidation(dto);

        if (valid) {
            model.addAttribute("username", dto.getUserName());
            return "registersuccess";
        } else {
            model.addAttribute("error", "Invalid Registration Details");
            return "signup";
        }
    }

    @GetMapping("/signin")
    public String signin(@RequestParam String gmail,
                         @RequestParam String password,
                         Model model) {

        boolean valid = registerService.loginValidation(gmail, password);

        if (valid) {
            model.addAttribute("username", gmail);
            return "signinsuccessfull";
        } else {
            model.addAttribute("error", "Invalid Gmail or Password");
            return "signin";
        }
    }
}
