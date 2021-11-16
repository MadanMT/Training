package com.microservice.ProfileManagement.service;

import com.microservice.ProfileManagement.domain.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List< EmployeeProfile > getEmployeeProfiles();
}
