package com.techatpark.practices;

import com.techatpark.practices.model.Employee;
import com.techatpark.practices.repository.EmployeeRepository;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class HelloJdbc {
    public static void main(String[] args) {
        // Create DS
        DataSource dataSource = getDatasource();

        EmployeeRepository employeeRepository = new EmployeeRepository(dataSource);
        Employee employee = new Employee();

//        employee.setId(24L);
        employee.setName("Venkad");
        employee.setPosition("QA");
//        Employee employee1 = employeeRepository.save(employee);
//        System.out.println(employee1);
        Iterable<Employee> employees = employeeRepository.findAll();
        for(Employee employee1 : employees){
            System.out.println(employee1);
        }


        long employeeCount = employeeRepository.count();
        System.out.println("Employees Count: " + employeeCount);
    }
    private static DataSource getDatasource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUser("postgres");
        dataSource.setPassword("password");
        return dataSource;
    }
}
