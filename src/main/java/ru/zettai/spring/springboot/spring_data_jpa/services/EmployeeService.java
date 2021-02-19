package ru.zettai.spring.springboot.spring_data_jpa.services;


import ru.zettai.spring.springboot.spring_data_jpa.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveOrUpdateEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployeeById(int id);

    List<Employee> findAllByName(String name);
}
