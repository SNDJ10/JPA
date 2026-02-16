package com.xworkz.customerservice.repository;


import com.xworkz.customerservice.entity.CustomerEntity;

public interface CustomerDAO {

    void saveDB(CustomerEntity customerEntity);
}
