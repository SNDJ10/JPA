package com.xworkz.register.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RegisterDTO {

 private String userName;
 private String gmail;
 private String password;
 private String confirmPassword;
 private  String mobileNumber;

}
