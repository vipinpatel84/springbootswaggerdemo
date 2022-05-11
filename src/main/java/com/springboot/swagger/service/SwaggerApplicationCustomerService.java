package com.springboot.swagger.service;

import com.springboot.swagger.exception.SwaggerApplicationException;
import com.springboot.swagger.model.Acknowledgement;
import com.springboot.swagger.model.ParentCustomer;
import org.springframework.stereotype.Service;

public interface SwaggerApplicationCustomerService {

    public Acknowledgement createParentCustomer(ParentCustomer parentCustomer) throws SwaggerApplicationException;
}
