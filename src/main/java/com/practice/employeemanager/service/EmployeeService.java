package com.practice.employeemanager.service;

import com.practice.employeemanager.exception.UserNotFoundException;
import com.practice.employeemanager.model.Employee;
import com.practice.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployee_code(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        boolean exists = employeeRepository.existsById(id);
        if(!exists){
            throw new UserNotFoundException("employee with id "+id+" doesn't exists");
        }
        employeeRepository.deleteById(id);
    }


    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("employee with id "+id+" doesn't exists"));
    }
}
