package com.example.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swagger.entity.Designation;

@Repository
public interface DesignationRepo extends JpaRepository<Designation, Integer>{

}
