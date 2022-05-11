package com.springboot.swagger.controller;

import com.springboot.swagger.SwaggerApplication;
import com.springboot.swagger.constants.SwaggerApplicationConstants;
import com.springboot.swagger.exception.SwaggerApplicationException;
import com.springboot.swagger.model.Acknowledgement;
import com.springboot.swagger.model.ErrorModel;
import com.springboot.swagger.model.ParentCustomer;
import com.springboot.swagger.service.SwaggerApplicationCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/customer/api")
public class SwaggerApplicationCustomerCreation {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerApplicationCustomerCreation.class);

    @Autowired
    private SwaggerApplicationCustomerService swaggerApplicationService;

    @Autowired
    SwaggerApplicationConstants applicationConstants;

    @PostMapping(value = "/createCustomer",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object createCustomer(@RequestBody ParentCustomer parentCustomer) {
        LOGGER.info("Parent Customer {}", parentCustomer);
        Acknowledgement acknowledgement;
        try {
            acknowledgement = swaggerApplicationService.createParentCustomer(parentCustomer);
        } catch (SwaggerApplicationException exception) {
            HashMap<String, String> errorCode = applicationConstants.setErrorCode();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setErrorCode(exception.getMessage());
            errorModel.setErrorDescription(errorCode.get(exception.getMessage()));
            return new ResponseEntity<>(errorModel, HttpStatus.PRECONDITION_FAILED); // Http Status 412
        }

        return new ResponseEntity<>(acknowledgement, HttpStatus.CREATED);
    }
}
