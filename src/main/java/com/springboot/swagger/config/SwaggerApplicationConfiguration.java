package com.springboot.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerApplicationConfiguration {
    public static final Contact DEFAULT_CONTACT = new Contact("Vipin Patel", "https://github.com/vipinpatel84", "");

    //private static final ApiInfo DEFAULT_API_INFO= new ApiInfo("Api info", "APi Documentation" ,"1.0","1.0", DEFAULT_CONTACT.getName(), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Spring Swagger API demo", "Swagger sApi Documentation Demo", "1.0", "urn:tos",
            DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

    private final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(Arrays.asList("application/json","appication/xml"));
    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_PRODUCES_AND_CONSUMES).consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }

}
