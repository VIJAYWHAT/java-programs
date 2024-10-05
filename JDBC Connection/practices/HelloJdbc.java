package com.techatpark.practices;

import com.techatpark.practices.model.Employee;
import com.techatpark.practices.repository.EmployeeRepository;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


public class HelloJdbc {
    public static void main(String[] args) {
        // Create DS
        DataSource dataSource = getDatasource();

        EmployeeRepository employeeRepository = new EmployeeRepository(dataSource);
        Employee employee = new Employee();
        List<Long> employees = new ArrayList<>();

        employee.setName("Venkad");
        employee.setPosition("QA");

        Long count = employeeRepository.count();

        System.out.println("employees count:" + count);
    }
    private static DataSource getDatasource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("user");
        dataSource.setPassword("password");
        dataSource.setDatabaseName("mydb");
        return dataSource;
    }
}
