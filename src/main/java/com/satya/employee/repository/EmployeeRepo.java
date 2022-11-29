package com.satya.employee.repository;

import com.satya.employee.entity.Employeedb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employeedb, Long> {

}
