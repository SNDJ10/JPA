package com.xworkz.collegedetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CollegeDTO {
    private int id;
    private String collegeName;
    private String collegeBranch;
    private long mobileNumber;
}
