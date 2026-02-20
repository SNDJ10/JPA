package com.xworkz.readdata.controller;

import com.xworkz.readdata.dto.StudentDetails;
import com.xworkz.readdata.service.StudentDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentDetailsImpl studentDetailsImpl;

    public StudentController(){
        System.out.println("this is controller");
    }
    @PostMapping("student")
    public String details(StudentDetails studentDetails){
        System.out.println("this is controlllll");
        studentDetailsImpl.saveData(studentDetails);
       return "studetdetails";
    }
}
