package com.microservice.ProfileManagement.controller;

import com.microservice.ProfileManagement.domain.EmployeeProfile;
import com.microservice.ProfileManagement.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping(value = "/addEmployee")
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping(value = "/employeeData")
    public List<EmployeeProfile> getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }

    @GetMapping(value = "/employee/{id}")
    public Optional<EmployeeProfile> getAllEmployee(@PathVariable Integer id) {
        return employeeProfileService.findEmployeeProfile(id);
    }

    @GetMapping(value = "/numberOfEmployees")
    public Long getEmployeesCount() {
        return employeeProfileService.getEmployeesCount();
    }

    @GetMapping(value = "/employees/{name}")
    public Optional<EmployeeProfile> getAllEmployee(@PathVariable String name) {
        return employeeProfileService.getEmployeeProfileByName(name);
    }
}