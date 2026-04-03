package com.xworkz.register.controller;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    RegisterService registerService;
public RegisterController(){
    System.out.println("this is controller");

}
@PostMapping("/register")
public String registrationdata(RegisterDTO registerDTO){
    System.out.println("this is controller==="+registerDTO);
    return "registersuccess";
}
    @PostMapping("/signin")
    public String signin(RegisterDTO registerDTO, Model model) {

        boolean valid = registerService.loginValidation(registerDTO);

        if (valid) {
            model.addAttribute("username", registerDTO.getUserName());
            return "signinsuccess";
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "signin";
        }
    }


}
