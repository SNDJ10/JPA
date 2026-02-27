package com.xworkz.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 30, message = "Name must be 3 to 30 characters")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name must contain only letters")
    private String name;

    @NotBlank(message = "College name cannot be empty")
    @Size(min = 3, max = 50, message = "College must be 3 to 50 characters")
    private String college;

    @NotNull(message = "Mobile number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Enter valid 10 digit mobile number")
    private String mobileNumber;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Qualification is required")
    private String qualification;
}