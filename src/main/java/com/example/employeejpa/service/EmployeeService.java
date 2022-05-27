package com.example.employeejpa.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeejpa.model.Employee;
import com.example.employeejpa.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

        @Autowired  // Dependency injection in spring.
            EmployeeRepository empRepository;   
          
        
     // CREATE 
        public Employee createEmployee(Employee emp) {
            return empRepository.save(emp);
        }

        // READ
        public List<Employee> getEmployees() {
            return empRepository.findAll();
        }

        // DELETE
        public void deleteEmployee(Long empId) {
            empRepository.deleteById(empId);
        }
        
        
        
        
     // UPDATE
        public Employee updateEmployee(Long empId, Employee employeeDetails) {
                Employee emp = empRepository.findById(empId).get();
                emp.setFirstName(employeeDetails.getFirstName());
                emp.setLastName(employeeDetails.getLastName());
                emp.setEmailId(employeeDetails.getEmailId());
                
                return empRepository.save(emp);                                
        }
        
        
}
