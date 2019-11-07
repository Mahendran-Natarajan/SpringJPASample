package com.hcl.spring.demo.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private  final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/rest/{empName}")
    public Employee fetchEmployee(@PathVariable String empName) {
        Employee emp = this.employeeRepository.findByEmpName(empName);
        List<Employee> empList = this.employeeRepository.findAll();
        boolean existEmp = this.employeeRepository.existsById(2L);

        Employee empDesig = this.employeeRepository.findByDesignation("MGR");

        System.out.println("No of employees : " + empList.size());
        System.out.println("employee 2 exists : " + existEmp);

        System.out.println("Employee MGR Name:" + empDesig.getEmpName());
        System.out.println("Employee MGR Salary:" + empDesig.getBasicSalary());


        System.out.println("Employee Name:" + emp.getEmpName());
        System.out.println("Employee Designation:" + emp.getDesignation());
        System.out.println("Employee Salary:" + emp.getBasicSalary());
        return emp;
   }
}

