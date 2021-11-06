package com.university.menagmentsystem.repository;

import com.university.menagmentsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

    User findByEmail(String email);
    /*User findByFirstName(String firstName);
    User findByFirstNameAndLastName(String firstName,  String lastName);
*/
}