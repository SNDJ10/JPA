package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void saveData(StudentDTO studentDTO);
    List<StudentDTO> getDtos();


}
