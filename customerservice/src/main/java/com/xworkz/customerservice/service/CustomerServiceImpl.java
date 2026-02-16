package com.xworkz.customerservice.service;

import com.xworkz.customerservice.dto.CustomerPortalDTO;
import com.xworkz.customerservice.entity.CustomerEntity;
import com.xworkz.customerservice.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    CustomerDAO customerDAO;
    @Override
    public void saveValidation(CustomerPortalDTO customerPortalDTO) {
        System.out.println("service===" + customerPortalDTO);

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustomerAge(customerPortalDTO.getCustomerAge());
        customerEntity.setCustomerName(customerPortalDTO.getCustomerName());
        customerEntity.setCustomerLocation(customerPortalDTO.getCustomerLocation());
        customerEntity.setCustomerReview(customerPortalDTO.getCustomerReview());
        customerEntity.setCustomerNumber(customerPortalDTO.getCustomerNumber());

        customerDAO.saveDB(customerEntity);


    }
}
