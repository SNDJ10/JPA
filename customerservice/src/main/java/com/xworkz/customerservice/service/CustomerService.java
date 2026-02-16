package com.xworkz.customerservice.service;

import com.xworkz.customerservice.dto.CustomerPortalDTO;

public interface CustomerService {
    public abstract void saveValidation(CustomerPortalDTO customerPortalDTO);
}