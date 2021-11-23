package com.microservice.ProfileManagement.service;

import com.microservice.ProfileManagement.domain.EmployeeProfile;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List< EmployeeProfile > getEmployeeProfiles();
//    Modifying
    Optional<EmployeeProfile> findEmployeeProfile(Integer id);
     long getEmployeesCount();
    Optional<EmployeeProfile> getEmployeeProfileByName(String name);

//    User findByuserName(String userName);
//    List<User> readAllByUserNameIsNotNull();
//    User saveAndFlush(User user);
//    void deleteByUserName(String userName);
//    @Modifying
//    @Query("update User user set user.userName = ?1 where user.id = ?2")
//    Integer updateUserNameById(String userName,Long userId);
//    User getTopByUserNameContaining(String character);
//    List<User> getTopByIdOrUserNameContaining( Long id, String userName);
}
