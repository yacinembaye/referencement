package com.webgram.Referencement.Controller;

import com.webgram.Referencement.Entity.Employee;
import com.webgram.Referencement.Service.EmployeeService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;



    //Add new employee
    @GetMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    // Add more than 1 employee
    @PostMapping("/addEmployees")
    public List<Employee> addAllEmployee(@RequestBody List<Employee> employees){
        return  employeeService.addAllEmployees(employees);
    }
    // Get employee by Id
    @GetMapping("/getEmployeeByID/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }
    // Get employee by name
    @GetMapping("/getEmployeeByName/{name}")

    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }
    // Update employee
    @PutMapping("/updateEmployee")
    public Employee updateEMployee(@RequestBody Employee employee) {

        return employeeService.updateEmployee(employee);
    }

    // Delete employee
    @DeleteMapping("/deleteEmployeeById/{id}")
    public boolean deleteEmployeeByID(@PathVariable int id) {
        return employeeService.deleteEmployeeByID(id);
    }


    // Get all employee
    @GetMapping("/getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }



}
