package com.xworkz.student.controller;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController() {
        System.out.println("this is controller");
    }

    @PostMapping("/list")
    public String studentdetails(
            @Valid StudentDTO studentDTO,
            BindingResult bindingResult,
            Model model) {

        // ✅ If validation fails
        if (bindingResult.hasErrors()) {
            return "register";  // return to form page
        }

        studentService.saveData(studentDTO);

        List<StudentDTO> studentDTOS = studentService.getDtos();
        model.addAttribute("std", studentDTOS);

        return "registersuccess";
    }
    @ModelAttribute("studentDTO")
    public StudentDTO getStudentDTO() {
        return new StudentDTO();
    }

    @GetMapping("read")
    public String studentRead(Model model) {
        List<StudentDTO> studentDTOS = studentService.getDtos();
        model.addAttribute("list", studentDTOS);
        return "read";
    }
}