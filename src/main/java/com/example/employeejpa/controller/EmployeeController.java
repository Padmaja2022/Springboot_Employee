package com.example.employeejpa.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.employeejpa.model.Employee;
	import com.example.employeejpa.service.EmployeeService;

	@RestController
	@RequestMapping("/api")
	public class EmployeeController {
	        @Autowired
	        EmployeeService empService;
	        
	        
	        // @RequestMapping(value="/employees", method=RequestMethod.POST  = PostMapping("/employees")
	        @RequestMapping(value="/employees", method=RequestMethod.POST)
	        public Employee createEmployee(@RequestBody Employee emp) {
	            return empService.createEmployee(emp);
	        }
	        //@RequestMapping(value="/employees", method=RequestMethod.GET) = GetMapping("/employees")
	        @RequestMapping(value="/employees", method=RequestMethod.GET)
	        public List<Employee> readEmployees() {
	            return empService.getEmployees();
	                   
	        }
	        
	           
	       //@GetMapping("/employees/template")
	       // public String templateEmployees(Model model() {      
	          //  model.addAttribute("employees", empService.getEmployees());
	           // return employees;
	       // }

	        // @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)= PutMapping("/employees/{empId}")
	        @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
	        public Employee readEmployees(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
	            return empService.updateEmployee(id, empDetails);
	        }

	        //@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE = DELETEMapping("/employees/{empId}")
	        @RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	        public void deleteEmployees(@PathVariable(value = "empId") Long id) {
	            empService.deleteEmployee(id);
	        }


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

