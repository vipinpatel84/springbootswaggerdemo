package com.springboot.swagger.service;

import com.springboot.swagger.exception.SwaggerApplicationException;
import com.springboot.swagger.model.ParentCustomer;
import org.springframework.stereotype.Service;

public interface SwaggerApplicationCustomerService {

    public String createParentCustomer(ParentCustomer parentCustomer) throws SwaggerApplicationException;
}
