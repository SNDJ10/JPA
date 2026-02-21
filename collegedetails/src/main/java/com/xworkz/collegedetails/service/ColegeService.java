package com.xworkz.collegedetails.service;

import com.xworkz.collegedetails.dto.CollegeDTO;

import java.util.List;

public interface ColegeService {
    void savaData(CollegeDTO collegeDTO);
    List<CollegeDTO> getDto();
}
