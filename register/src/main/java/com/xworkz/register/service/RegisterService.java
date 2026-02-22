package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;

public interface RegisterService {

    boolean registerValidation(RegisterDTO dto);

    boolean loginValidation(String gmail, String password);
}
