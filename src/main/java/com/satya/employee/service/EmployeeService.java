package com.satya.employee.service;

import com.satya.employee.entity.Employeedb;
import com.satya.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public long saveEmployee(@RequestBody Employeedb employeedb){
        Employeedb.builder().employeeName(employeedb.getEmployeeName()).department(employeedb.getDepartment()).build();
        employeedb=employeeRepo.save(employeedb);
        return employeedb.getId();



    }
}
