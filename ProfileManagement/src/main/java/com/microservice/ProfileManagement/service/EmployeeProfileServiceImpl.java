package com.microservice.ProfileManagement.service;

import com.microservice.ProfileManagement.dao.ProfileRepository;
import com.microservice.ProfileManagement.domain.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService{

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public void addEmployeeProfile(EmployeeProfile profile) {
        profileRepository.save(profile);
    }

    @Override
    public List<EmployeeProfile> getEmployeeProfiles() {
        return profileRepository.findAll();
    }
}
