package com.xworkz.phone.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PhoneDAOimpl implements PhoneDAO{
    @Override
    public void save(PhoneDAO phoneDAO) {
        System.out.println("this is repo==="+phoneDAO);
    }
}
