package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.register.repository.RegisterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterDAO registerDAO;

    @Override
    public boolean registerValidation(RegisterDTO dto) {

        if (dto.getUserName() == null || dto.getUserName().isEmpty())
            return false;

        if (dto.getGmail() == null || !dto.getGmail().contains("@"))
            return false;

        if (dto.getPassword() == null || dto.getPassword().length() < 4)
            return false;

        if (!dto.getPassword().equals(dto.getConfirmPassword()))
            return false;

        if (dto.getMobileNumber() == null || dto.getMobileNumber().length() != 10)
            return false;

        RegisterEntity entity = new RegisterEntity();
        entity.setUserName(dto.getUserName());
        entity.setGmail(dto.getGmail());
        entity.setPassword(dto.getPassword());
        entity.setMobileNumber(dto.getMobileNumber());

        registerDAO.saveData(entity);

        return true;
    }

    @Override
    public boolean loginValidation(String gmail, String password) {

        RegisterEntity entity = registerDAO.findByGmail(gmail);

        if (entity != null && entity.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}
