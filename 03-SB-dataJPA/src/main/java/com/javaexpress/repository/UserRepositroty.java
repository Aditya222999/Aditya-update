package com.javaexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.models.User;

@Repository
public interface UserRepositroty extends JpaRepository<User, Integer>{

}
