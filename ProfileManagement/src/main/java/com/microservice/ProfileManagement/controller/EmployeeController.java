package com.microservice.ProfileManagement.controller;

import com.microservice.ProfileManagement.domain.EmployeeProfile;
import com.microservice.ProfileManagement.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping(value = "/addEmployee")
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping(value = "employeeData")
    public List< EmployeeProfile > getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }
}
