package com.springboot.swagger.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/IncentivePlans/api")
public class SwaggerApplicationController {

    @GetMapping("/EmployerDetails/{employerId}")
    public String getEmployerDetails(@PathVariable String employerId){
        return "hello Employer" + employerId;
    }

    @GetMapping("/AllPlanDetails")
    public HashMap<String, String> getPlanDetails(){
        return new HashMap<>();
    }

    @GetMapping("/Employer/{employerID}/Employees")
    public List<String> getEmployerEmployee(@PathVariable String employerId){
        return null;
    }

    @GetMapping("/EligiblePlans")
    public HashMap<String, String> getEligiblePlanDetailsOfEmployer(){
        return new HashMap<>();
    }

    @PostMapping("/Employer/{employerId}/InviteEmployee")
    public String inviteEmployeeForIncentivePlans(){
        return "OK";
    }

    @PutMapping("/Employer/{employerId}/resendInvite")
    public String resendInviteToEmployee(){
        return "OK";
    }

}
