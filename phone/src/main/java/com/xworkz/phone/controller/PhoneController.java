package com.xworkz.phone.controller;

import com.xworkz.phone.dto.PhoneDTO;
import com.xworkz.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class PhoneController {
    @Autowired
    PhoneService phoneService;

@PostMapping("/phone")
    public String details(PhoneDTO phoneDTO){
    System.out.println("controller" +phoneDTO);
    phoneService.saveData(phoneDTO);
        return "success";

    }
}
