package com.xworkz.readdata.service;


import com.xworkz.readdata.dto.StudentDetails;

import java.util.List;

public interface StudentDetailsService {
    void saveData(StudentDetails studentDetails);
List<StudentDetails> getDtos();
}
