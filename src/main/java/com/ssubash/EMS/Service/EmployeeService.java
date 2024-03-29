package com.ssubash.EMS.Service;

import com.ssubash.EMS.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById (long id);
}


