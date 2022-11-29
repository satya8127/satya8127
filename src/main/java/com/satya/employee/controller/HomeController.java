package com.satya.employee.controller;

import com.satya.employee.entity.Employeedb;
import com.satya.employee.repository.EmployeeRepo;
import com.satya.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController
{

   @Autowired
   private EmployeeService employeeService;

   @Autowired
   private EmployeeRepo employeeRepo;

   @PostMapping("/save")
   public ResponseEntity<Long> saveEmployee(@RequestBody Employeedb employeedb){

      return new ResponseEntity<>(employeedb.getId(), HttpStatus.OK);

   }
   @PostMapping("/add")
   public Employeedb addemployee(@RequestBody Employeedb employeedb){
      return employeeRepo.save(employeedb);
   }

}
