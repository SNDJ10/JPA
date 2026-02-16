package com.xworkz.phone.service;

import com.xworkz.phone.dao.PhoneDAO;
import com.xworkz.phone.dto.PhoneDTO;
import com.xworkz.phone.entity.PhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceimpl implements PhoneService{
@Autowired
    PhoneDAO phoneDAO;
    @Override
    public void saveData(PhoneDTO phoneDTO) {
        System.out.println("this is service=="+phoneDTO);
        PhoneEntity phone=new PhoneEntity();
        phone.setId(phone.getId());
        phone.setName(phone.getName());
        phone.setNumber(phone.getNumber());
        phoneDAO.save(phoneDAO);
    }
}
