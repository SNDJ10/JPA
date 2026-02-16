package com.xworkz.phone.service;

import com.xworkz.phone.dto.PhoneDTO;
import org.springframework.stereotype.Service;

@Service

public interface PhoneService {
    public void saveData(PhoneDTO phoneDTO);

    }

