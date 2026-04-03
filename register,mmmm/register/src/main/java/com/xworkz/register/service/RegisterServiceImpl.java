package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.register.repository.RegisterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterDAO registerDAO;

    @Override
    public boolean validation(RegisterDTO registerDTO) {

        System.out.println("This is validation");

        if (registerDTO == null) {
            return false;
        }

        // Username → First letter uppercase
        String usernamePattern = "^[A-Z][a-zA-Z]{2,}$";
        if (registerDTO.getUserName() == null ||
                !registerDTO.getUserName().matches(usernamePattern)) {

            System.out.println("Username must start with uppercase and min 3 letters");
            return false;
        }

        // Gmail → must end with @gmail.com
        String gmailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        if (registerDTO.getGmail() == null ||
                !registerDTO.getGmail().matches(gmailPattern)) {

            System.out.println("Gmail must be valid and end with @gmail.com");
            return false;
        }

        // Mobile number → exactly 10 digits
        String mobilePattern = "^[0-9]{10}$";
        if (!String.valueOf(registerDTO.getMobileNumber())
                .matches(mobilePattern)) {

            System.out.println("Mobile number must be exactly 10 digits");
            return false;
        }

        // Password → minimum 8 chars, 1 uppercase, 1 lowercase, 1 number, 1 special char
        String passwordPattern =
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

        if (registerDTO.getPassword() == null ||
                !registerDTO.getPassword().matches(passwordPattern)) {

            System.out.println("Password not strong enough");
            return false;
        }

        // Confirm password match
        if (!registerDTO.getPassword()
                .equals(registerDTO.getConfirmPassword())) {

            System.out.println("Passwords do not match");
            return false;
        }

        // If all validations pass → Save entity
        RegisterEntity entity = new RegisterEntity();
        entity.setId(registerDTO.getId());
        entity.setUserName(registerDTO.getUserName());
        entity.setGmail(registerDTO.getGmail());
        entity.setPassword(registerDTO.getPassword());
        entity.setMobileNumber(registerDTO.getMobileNumber());

        registerDAO.saveData(entity);

        return true;
    }

    @Override
    public boolean loginValidation(RegisterDTO registerDTO) {
        return false;
    }
}
