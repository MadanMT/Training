package com.microservice.ProfileManagement.dao;

import com.microservice.ProfileManagement.domain.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<EmployeeProfile, Integer> {

}
