package ru.zettai.spring.springboot.spring_data_jpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.zettai.spring.springboot.spring_data_jpa.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByName(String name);
}
