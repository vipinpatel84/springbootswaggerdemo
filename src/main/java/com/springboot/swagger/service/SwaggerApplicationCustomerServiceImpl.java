package com.springboot.swagger.service;

import com.springboot.swagger.SwaggerApplication;
import com.springboot.swagger.constants.SwaggerApplicationConstants;
import com.springboot.swagger.exception.SwaggerApplicationException;
import com.springboot.swagger.model.Acknowledgement;
import com.springboot.swagger.model.ErrorModel;
import com.springboot.swagger.model.ParentCustomer;
import com.springboot.swagger.repository.SwaggerApplicationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SwaggerApplicationCustomerServiceImpl implements SwaggerApplicationCustomerService{

    @Autowired
    KafkaTemplate<String ,Object> kafkaTemplate;

    @Autowired
    SwaggerApplicationDao swaggerApplicationDao;

    @Override
    public Acknowledgement createParentCustomer(ParentCustomer parentCustomer) throws SwaggerApplicationException {
        Acknowledgement acknowledgement = new Acknowledgement();
        if(parentCustomer.getEmailAddress().isEmpty() || null==parentCustomer.getEmailAddress()){
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_01);
        }
        else if(swaggerApplicationDao.findById(parentCustomer.getEmailAddress()).isPresent()) //if parent customer already exist in
        {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_05);
        }
        else if (parentCustomer.getFirstName().isEmpty() || null==parentCustomer.getFirstName()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_02);
        } else if (parentCustomer.getLastName().isEmpty() || null==parentCustomer.getLastName()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_03);
        } else if (parentCustomer.getPassword().isEmpty() || null==parentCustomer.getPassword()) {
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_04);
        }

        try {
            kafkaTemplate.send("swagger-credential-creation", parentCustomer);
        }
        catch (Exception e){
            throw new SwaggerApplicationException(SwaggerApplicationConstants.ERR_06);
        }
        acknowledgement.setStatus(SwaggerApplicationConstants.INPROGRESS);
        return acknowledgement;
    }
}
