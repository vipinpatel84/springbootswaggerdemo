package com.springboot.swagger.constants;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SwaggerApplicationConstants {


    public HashMap<String,String> setErrorCode(){
        HashMap<String,String> errorCodeMap = new HashMap<>();
        errorCodeMap.put(ERR_01,EMPTY_EMAIL_ADDRESS);
        errorCodeMap.put(ERR_02,EMPTY_FIRST_NAME);
        errorCodeMap.put(ERR_03,EMPTY_LAST_NAME);
        errorCodeMap.put(ERR_04,EMPTY_PASSWORD);
        errorCodeMap.put(ERR_05,ACCOUNT_ALREADY_EXIST);
        return errorCodeMap;
    }

    public static final String ERR_01= "ERROR_01";
    public static final String EMPTY_EMAIL_ADDRESS="Invalid Email Address or Empty Email Address is provided";

    public static final String ERR_02="ERROR_02";
    public static final String EMPTY_FIRST_NAME="Empty First Name or Null value passed";

    public static final String ERR_03="ERROR_03";
    public static final String EMPTY_LAST_NAME="Empty Last Name or Null value passed";

    public static final String ERR_04="ERROR_04";
    public static final String EMPTY_PASSWORD="Empty Password Name or Null value passed";

    public static final String ERR_05="ERROR_05";
    public static final String ACCOUNT_ALREADY_EXIST="Email Address already exist, Kindly recheck your email address";
}
