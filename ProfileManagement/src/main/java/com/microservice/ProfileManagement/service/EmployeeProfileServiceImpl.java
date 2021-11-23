package com.microservice.ProfileManagement.service;

import com.microservice.ProfileManagement.dao.ProfileRepository;
import com.microservice.ProfileManagement.domain.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<EmployeeProfile> findEmployeeProfile(Integer id) {
        return profileRepository.findById(id);
    }

    @Override
    public long getEmployeesCount(){
        return profileRepository.count();
    }

    @Override
    public Optional<EmployeeProfile> getEmployeeProfileByName(String name){
        return profileRepository.getEmployeeProfileByNameContains(  name);
    }

}
