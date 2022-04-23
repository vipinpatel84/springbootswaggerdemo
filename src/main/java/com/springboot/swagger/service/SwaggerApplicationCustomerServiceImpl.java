package com.springboot.swagger.service;

import com.springboot.swagger.SwaggerApplication;
import com.springboot.swagger.constants.SwaggerApplicationConstants;
import com.springboot.swagger.exception.SwaggerApplicationException;
import com.springboot.swagger.model.ErrorModel;
import com.springboot.swagger.model.ParentCustomer;
import org.springframework.stereotype.Service;

@Service
public class SwaggerApplicationCustomerServiceImpl implements SwaggerApplicationCustomerService{
    @Override
    public String createParentCustomer(ParentCustomer parentCustomer) throws SwaggerApplicationException {

        if(parentCustomer.getEmailAddress().isEmpty() || null==parentCustomer.getEmailAddress()){
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_01);
        } else if (parentCustomer.getFirstName().isEmpty() || null==parentCustomer.getFirstName()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_02);
        } else if (parentCustomer.getLastName().isEmpty() || null==parentCustomer.getLastName()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_03);
        } else if (parentCustomer.getPassword().isEmpty() || null==parentCustomer.getPassword()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_04);
        }


        return null;
    }
}
